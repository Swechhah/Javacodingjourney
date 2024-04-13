SELECT * FROM Projects WHERE CompletionDate > '2023-06-01';

SELECT StartDate, COUNT(*) AS NumProjects
FROM Projects
GROUP BY StartDate;

SELECT * FROM Skills LIMIT 5;

SELECT * FROM Projects WHERE StartDate > (SELECT AVG(StartDate) FROM Projects);

SELECT Projects.*, Skills.SkillName, Skills.Description
FROM Projects
LEFT JOIN Skills ON Projects.ProjectID = Skills.InfoID;