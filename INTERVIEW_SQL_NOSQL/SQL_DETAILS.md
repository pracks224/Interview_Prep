**Table of content:**

### [NO SQL](INTERVIEW_SQL_NOSQL/NO_SQL_DETAILS.md)

### SQL

1. [Joins?](#ans-1)
2. [How would you fetch the duplicate records from database ?](#ans-2)
3. [What is the N+1 problem and How would you solve it ?](#ans-3)
4. [What are indexes and how do they work in databases?](#ans-4)
5. [What is the order of execution of select Command ?](#ans-5)
6. [Subqueries](#ans-6)
7. [Common Table Expression](#ans-7)
8. [scalar function vs Table Function](#ans-8)
9. [window function](#ans-9)
10. [Temporaray Table](#ans-10)
11. [Cursors](#ans-11)
12. [Sql Transactions](#ans-12)
13. [Constraints]()
14. [Index]()
15. [Operators]()
    - [Union Vs UnionAll]()
16. [VIEWS]()
    - [MATERIALIZED VIEW]()
17. [Functions]()
    - [Function Vs Store Procedures]()
18. [OLAP vs OLTP](#ans-18)
19. [CASE Statement in SQL for If-else](#ans-19)

### Answers :

<a id="ans-1"></a>

1.  - INNER JOIN: Returns records that have matching values in both tables.
    - LEFT JOIN (or LEFT OUTER JOIN): Returns all records from the left table and the matched records from the right table. The result is NULL from the right side if there is no match.
    - RIGHT JOIN (or RIGHT OUTER JOIN): Returns all records from the right table and the matched records from the left table. The result is NULL from the left side when there is no match.
    - FULL JOIN (or FULL OUTER JOIN): Returns all records when there is a match in either left or right table. Records with no match in the left or right tables will contain NULL.
    - CROSS JOIN: Returns the Cartesian product of the two tables, meaning it returns all possible combinations of rows from the two tables.
    - SELF JOIN: A regular join, but the table is joined with itself.
    - NATURAL JOIN: Joins two tables based on columns with the same name and datatypes, automatically using all columns with the same name.

<a id="ans-2"></a> 2. Fetch Duplicate

SELECT CNAME FROM CUSTOMER GROUP BY CNAME HAVING COUNT(\*) >1;

<a id="ans-3"></a> 3. N+1 Problem

<a id="ans-4"></a> 4. Index in Database

<a id="ans-5"></a> 5. Order of Execution of Select Command

FROM – JOIN – ON – WHERE – GROUP BY – HAVING – SELECT – ORDER BY – LIMIT

<a id="ans-6"></a> 6. SubQuery

### What is the difference between nested and correlated subqueries?

<a id="ans-7"></a>
7.CTE

<a id="ans-8"></a> 8. Table Function

<a id="ans-9"></a> 9. Window function

- A window function in SQL performs calculations across a set of table rows related to the current row, providing a way to perform aggregate and ranking operations without collapsing the result set into a single row.
- It uses the OVER clause to define the window or partition of rows, and can operate on each row individually while still considering the context of the surrounding rows.
- Examples include functions like ROW_NUMBER(), RANK(), SUM(), and AVG().

#### Example Using window Function

- Select the highest salary department wise
  // CTE
  WITH RankedEmployee AS (
  SELECT ID,NAME,DEPARTMENT_NAME,SALARY,
  ROW_NUMBER() OVER(PARTITION_BY E.DEPART_ID ORDER BY E.SALARY DESC) AS ROWNUM
  FROM
  EMPLOYEE E
  INNER JOIN DEPARTMENT D
  ON E.DEPRT_ID = D.DEPRT_ID
  )

SELECT NAME,DEPARTMENT_NAME FROM RankedEmployee WHERE ROWNUM = 1

<a id="ans-10"></a> 10. Temporary Table

Temporary tables are useful for storing intermediate results and managing data within the scope of a session or transaction. It will be droped once the session over.

Create Temporray Table

<a id="ans-8"></a> 11. Cursor

- A cursor in SQL is a database object used to retrieve, manipulate, and navigate through a result set row by row.

<a id="ans-18"></a>

#### OLAP vs OLTP

- Online transaction Processing (OLTP) and Online Analytical Processing
- OLTP stores the data in the form of Table for couple of years data where as OLAP stores the data for longer duration for 100 years
- OLTP high consistecy where as OLAP for analytical, less consistent
- OLTP ex. Oracle,Mysql
  OLAP ex Big Query, Redshift, TeraData etc
- OLTP two dimensional and OLAP is multidimensional

<a id="ans-18"></a>

#### CASE Statement

SELECT EMPLOYEE_ID,FIRSTNAME,LASTNAME,SALARY
CASE
WHEN SALARY > 70000 THEN 'HIGH'
WHEN SALARY BETWEEN 30000 AND 70000 THEN 'MEDIUM'
ELSE 'UNKNOWN'
END AS SALARYBAND
FROM EMPLOYEES;

#### Find the student with same mark on physics and chemistry.

    Student ->student_id int|subject varchar20|marks int|

    select student_id from Student
        where subject in("physics","chemistry")
        group by student_id
        having  count(distinct subject) = 2
        and count(distnict marks)=1

#### Find second most recent activity and if user has only 1 activity then return that as it is

UserActivity -> user_id|activity|startdate|enddate

we have to use rank() over activity ,row_num() - assign rank to same value to different

with cte1 as (
select \*,count(activity),rank() over partion by username order by startdate as rnk
from UserActivity
)
select username,activity,startdatefrom cte1 where rnk =2 or activity_cnt =1
