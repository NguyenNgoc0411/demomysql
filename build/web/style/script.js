const clickMe = document.querySelectorAll(".clickMe");

clickMe.addEventListener("click", (event) => {
    
    event.preventDefault();
    clickMe.classList.add("clicked");
    
    
    // Thêm bất kỳ hiệu ứng khác sau khi click vào đây
});
