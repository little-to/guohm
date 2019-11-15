const express = require("express");
var path = require("path");
const app = express();
formidable = require("formidable"); //载入 formidable
const bodyParser = require("body-parser");
const multer = require("multer");
var router = express.Router();  
app.use(bodyParser.urlencoded({ extended: true }));
app.use(bodyParser.json());
app.use(express.static(path.join(__dirname, 'public')));

var mulu;
const storage = multer.diskStorage({
  //destination 用来设置上传文件的路径 可以接收一个回调函数， 或者一个字符串
  //如果传递一个回调函数的话，则需要确保路径有效
  destination:function (req, file, cb) {
	  var fname = file.originalname;
	  var pre = fname.substring(0,3);
	  mulu=pre+"/";
	  //console.log(pre);
      cb(null, pre+"/");
  }, 
  //filename 属性可以用来指定文件上传以后保存到服务器中的名字
  filename: function (req, file, cb) {
    //cb(null, file.fieldname + '-' + Date.now())
    //获取文件的扩展名
    //Chrysanthemum.jpg
    let fname = file.originalname;
    let extName = "";
    //判断文件是否具有扩展名
    if(fname.lastIndexOf(".") != -1){
      extName = fname.slice(fname.lastIndexOf("."));
    }
    //上传文件时，一般不会直接将用户的文件名直接保存的服务器中
    //一般会随机生成一个文件名
    cb(null, fname);
  }
})
const upload = multer({
    storage: storage
});
app.post("/testUpload" , (req , res)=>{

	 //获取解析请求体的函数
	let fu = upload.single('photo');
	//手动调用函数来解析请求体
	fu(req , res , (err)=>{
		
		var date = new Date();
		var year = date.getFullYear();
		var month = date.getMonth()+1;
		var day = date.getDate();
		var hour = date.getHours();
		var minute = date.getMinutes();
		var second = date.getSeconds();
		console.log();
		
		if(err){
		  //证明上传出错了，文件大小超标
		  console.log(err+"\n"+year+'年'+month+'月'+day+'日 '+hour+':'+minute+':'+second);
		  res.send("文件太大了，请上传200kb以下的文件！！");
		}else{
		  //读取请求参数
		  console.log(mulu+" 上传成功                  "+year+'年'+month+'月'+day+'日 '+hour+':'+minute+':'+second);
		  res.send("上传成功~~~");
		}
	});
  
});

app.listen(3333,()=>{
  console.log("running~~~");
});