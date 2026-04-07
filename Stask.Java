<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>TaskReminder</title>

    <style>
        * {
            box-sizing: border-box;
            margin: 0;
            padding: 0;
            font-family: "Segoe UI", Arial, sans-serif;
        }

        body {
            background: linear-gradient(135deg, #e0f2fe, #fef9ff);
            min-height: 100vh;
            padding: 1rem;
        }

        nav {
            background: white;
            padding: 1rem;
            border-radius: 15px;
            display: flex;
            justify-content: space-between;
            flex-wrap: wrap;
            box-shadow: 0 4px 15px rgba(0, 0, 0, 0.08);
            margin-bottom: 1rem;
        }

        .logo {
            font-weight: bold;
            color: #6366f1;
            font-size: 1.4rem;
        }

        .nav-links {
            display: flex;
            gap: 0.5rem;
            list-style: none;
        }

        .nav-links a {
            text-decoration: none;
            color: #444;
            font-weight: 600;
            padding: 0.4rem 0.8rem;
            border-radius: 10px;
            transition: 0.3s;
        }

        .nav-links a:hover {
            background: #6366f1;
            color: white;
        }

        .container {
            max-width: 800px;
            margin: auto;
        }

        header {
            text-align: center;
            margin-bottom: 1.5rem;
        }

        header h1 {
            color: #6366f1;
            font-size: 1.8rem;
        }

        header p {
            color: #666;
            font-size: 0.95rem;
        }


        .form-card {
            background: white;
            padding: 1.5rem;
            border-radius: 20px;
            margin-bottom: 1.5rem;
            box-shadow: 0 5px 20px rgba(0, 0, 0, 0.06);
        }

        .form-group {
            margin-bottom: 1rem;
        }

        label {
            font-size: 0.9rem;
            font-weight: bold;
            color: #555;
        }

        input {
            width: 100%;
            padding: 0.9rem;
            margin-top: 0.4rem;
            border: 2px solid #eee;
            border-radius: 12px;
            font-size: 1rem;
        }

        input:focus {
            outline: none;
            border-color: #6366f1;
        }


        .add-btn {
            width: 100%;
            padding: 0.9rem;
            background: linear-gradient(90deg, #6366f1, #818cf8);
            color: white;
            border: none;
            border-radius: 12px;
            font-weight: bold;
            cursor: pointer;
        }

        .add-btn:hover {
            opacity: 0.9;
        }


        .tasks-section {
            background: white;
            padding: 1.5rem;
            border-radius: 20px;
            box-shadow: 0 5px 20px rgba(0, 0, 0, 0.06);
        }

        .tasks-section h2 {
            margin-bottom: 1rem;
            color: #444;
        }

        .task-item {
            background: #f9fafb;
            border: 2px solid #eee;
            padding: 1rem;
            border-radius: 15px;
            margin-bottom: 0.8rem;
            display: flex;
            flex-direction: column;
            gap: 0.5rem;
        }

        .task-text {
            font-size: 1rem;
            color: #333;
        }

        .task-date {
            font-size: 0.8rem;
            color: #777;
        }

        .task-buttons {
            display: flex;
            gap: 0.5rem;
        }

        .btn {
            flex: 1;
            padding: 0.5rem;
            border: none;
            border-radius: 20px;
            font-size: 0.75rem;
            font-weight: bold;
            cursor: pointer;
        }

        .btn-done {
            background: #22c55e;
            color: white;
        }

        .btn-edit {
            background: #f59e0b;
            color: white;
        }

        .btn-delete {
            background: #ef4444;
            color: white;
        }

        .empty-text {
            text-align: center;
            color: #999;
            padding: 1rem;
        }


        .section {
            display: none;
            background: white;
            padding: 1.5rem;
            border-radius: 20px;
            margin-top: 1rem;
            box-shadow: 0 5px 20px rgba(0, 0, 0, 0.06);
        }

        .active {
            display: block;
        }


        @media (max-width: 600px) {
            nav {
                flex-direction: column;
                gap: 0.5rem;
            }

            .nav-links {
                width: 100%;
                justify-content: space-around;
            }
        }
    </style>
</head>

<body>

    <nav>
        <div class="logo"> TaskReminder</div>
        <ul class="nav-links">
            <li><a href="#" onclick="showSection('home')">Home</a></li>
            <li><a href="#" o
