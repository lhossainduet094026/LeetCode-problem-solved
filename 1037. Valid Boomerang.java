public boolean isBoomerang(int[][] points) {
        
        double area;
        //if the area of triangle is greater than 0 form this 3 points then it is boomerang
        area=0.5*(points[0][0]*(points[1][1]-points[2][1])+points[1][0]*(points[2][1]-                     points[0][1])+points[2][0]*(points[0][1]-points[1][1]));
        //System.out.println(Math.abs(area));
        if(area!=0)
            return true;
        
        return false;
    }