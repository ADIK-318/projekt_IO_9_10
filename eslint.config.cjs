module.exports = [
  {
    files: ["**/*.js"],
    languageOptions: {
      ecmaVersion: 2021,
      sourceType: "commonjs"
    },
    rules: {
      "no-undef": "error",
      "no-unused-vars": "error"
    }
  }
];
