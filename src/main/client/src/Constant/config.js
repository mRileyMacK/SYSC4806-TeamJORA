export const studentEndPoint = "/addStudent";

var url = ""
if (process.env === "development") {
    let port = "8080";
    url = `http://localhost:${port}`;
} else {
    let port = "8080"
    url = `http://localhost:${port}`
}

export const baseURL = url;
export const studentURL = `${baseURL}${studentEndPoint}`;