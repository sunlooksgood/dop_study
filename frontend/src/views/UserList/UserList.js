import React, { useState, useEffect } from 'react';
import { makeStyles } from '@material-ui/styles';
import axios from 'axios'

import { UsersToolbar, UsersTable } from './components';

const useStyles = makeStyles(theme => ({
  root: {
    padding: theme.spacing(3)
  },
  content: {
    marginTop: theme.spacing(2)
  }
}));

const UserList = () => {
  const classes = useStyles();

  const [users, setUsers] = useState([
    {
      id: 1,
      name: 'Ekaterina Tankova',
      address: {
        country: 'USA',
        state: 'West Virginia',
        city: 'Parkersburg',
        street: '2849 Fulton Street'
      },
      email: 'ekaterina.tankova@devias.io',
      phone: '304-428-3097',
      avatarUrl: '/images/avatars/avatar_3.png',
      createdAt: 1555016400000
    }]);

  const [address, setAddress] = useState("아무주소");

  useEffect(() => {
    axios.get('http://localhost:8081/people')
    .then(res => {
      console.log(res.data._embedded[0][1]);
    })
  } , []);

  return (
    <div className={classes.root}>
      <UsersToolbar />
      <div className={classes.content}>
        <UsersTable users={users} />
      </div>
    </div>
  );
};

export default UserList;
