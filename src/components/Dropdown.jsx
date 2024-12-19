import { Select,MenuItem, FormControl ,InputLabel } from "@mui/material";


const Dropdown=({
    lable,
    id,
    value,
    handleChange,
    name,
    options,
    ...props

}) =>
{
    return (
        <FormControl fullWidth>
  <InputLabel id={id}>{lable}</InputLabel>
        <Select
    labelId={id}
    id={id}
   value={value}
    label={lable}
   onChange={handleChange}
   name={name}
   {...props}
  >
   {
    options.map(option=>(
        <MenuItem value={option}>{option}</MenuItem>
    ))
   }
  </Select>
  </FormControl>
    )
}

export default Dropdown;
