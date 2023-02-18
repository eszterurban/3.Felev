const API_KEY = "7NwYFDvgkb2mmmNuOV1j5x6pZnOSZUm4iuTqLuYR";

async function search(){
    const inputElement = document.getElementById(searchTerm);
    const response = await fetch(`https://api.watchmode.com/v1/search/?apiKey=${API_KEY}&search_field=name&search_value=$(inputElemenet.value)`);
    const responseBody = await response.json();
    const title = responseBody.title_results;
    if(title){
        fillSearchResults(title);
    }
}

function fillSearchResultsList(title){
    const searchResultsElement = document.getElementById("searchResult");
    title.forEach(title=> {
        const listItem = document.createElement("li");
        listItem.textContent = title.name;
        searchResultsElement.append(listItem);
    });
}
