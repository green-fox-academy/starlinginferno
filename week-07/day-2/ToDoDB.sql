CREATE TABLE toDoApp (
  id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
  task VARCHAR(10),
  description VARCHAR(50),
  status ENUM ('ToDo', 'Doing', 'Review', 'Done')
);

INSERT INTO toDoApp (task, description, status) VALUES ("shopping", "milk, bread", 'ToDo');
INSERT INTO toDoApp (task, description, status) VALUES ("watch", "B99 trailer", 'Doing');
UPDATE toDoApp SET status='Done' WHERE id=2;
DELETE  FROM toDoApp WHERE id>2;
SELECT * FROM toDoApp;
DROP TABLE toDoApp;