/**
 * Created by tim on 2017/6/28.
 */

function getProjectName()
{
    var lcoUrl =$("link").attr("href");
    var index=lcoUrl.indexOf("/",1);
    //alert(index);
  var projectName=lcoUrl.substr(0,index);
  if(projectName=="/vendor")
  {
      projectName="";
  }
    //alert(projectName);
    return projectName;
}

function fnGetSelected( oTableLocal )
{
    return oTableLocal.$('tr.row_selected');
}
