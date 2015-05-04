function showtime()
{
    var a = new Date();
    document.write(a.getDate() + " " + a.getMonth() + " " + a.getFullYear() + " " + a.getTime());
    return 1;
}


function formattedtime()
{
    var a = new Date();
    document.write(a.getDate() + " " + a.getMonth() + " " + a.getFullYear() + " " + a.getHours() + ":" + a.getMinutes() + ":" + a.getSeconds());

}
