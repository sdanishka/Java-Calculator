package com.example.calci;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.ScriptableObject;
public class MainActivity extends AppCompatActivity {
    Button oneBTN,twoBTN,threeBTN,fourBTN,fiveBTN,sixBTN,sevenBTN,eightBTN,nineBTN,zeroBTN;
    Button delBTN, acBTN,equalBTN;
    Button addBTN,subBTN,mulBTN,divBTN,modBTN;
    Button openBracketBTN,closeBracketBTN;

        public void evaluateExpression(String expression) {
            Context cx = Context.enter();
            Scriptable scope = cx.initStandardObjects();
            Object result;
            TextView resArea;
            resArea = findViewById(R.id.finalResultArea);
            try {
                result = cx.evaluateString(scope, expression, "JavaScript", 1, null);
                resArea.setText(result.toString());
            } catch (Exception e) {
                // Handle the exception (e.g., show an error message)
                Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
            } finally {
                Context.exit();
            }
        }
    public String eval(String str){
        try {
            Context rHino = Context.enter();
            rHino.setOptimizationLevel(-1);
            Scriptable scope = rHino.initStandardObjects();
            String tempRes = rHino.evaluateString(scope,str,"javascript",1,null).toString();
            return tempRes;
        }catch (Exception e){
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_SHORT).show();
        }finally {
            Context.exit();
        }
        return "Error";
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        equalBTN = findViewById(R.id.equalBTN);
        equalBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView equalTV;
                equalTV = findViewById(R.id.resultAREA);
                String data = equalTV.getText().toString();
                TextView resArea;
                resArea = findViewById(R.id.finalResultArea);
                String res = eval(data);
//                Context rHino = Context.enter();
//                rHino.setOptimizationLevel(-1);
//                Scriptable scope = rHino.initStandardObjects();
//                String temp = rHino.evaluateString(scope,data,"javascript",1,null).toString();
                resArea.setText(res);
            }
        });


        delBTN = findViewById(R.id.delBTN);
        delBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv;
                tv = findViewById(R.id.resultAREA);
                String s =  tv.getText().toString();
                if (s.length()==0){
                    tv.setText("");
                    Toast.makeText(MainActivity.this, "NOTHING TO DELETE", Toast.LENGTH_SHORT).show();
                }
                else {
                    String newStr = s.substring(0, s.length() - 1);
                    tv.setText(newStr);
//                    Toast.makeText(MainActivity.this, "Deleted", Toast.LENGTH_SHORT).show();
                }
            }
        }); 
        
        acBTN = findViewById(R.id.acBTN);
        acBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView TV,fTV;
                TV = findViewById(R.id.resultAREA);
                fTV = findViewById(R.id.finalResultArea);
                String s =  TV.getText().toString();
                if (s.length()==0){
                    TV.setText("");
                    fTV.setText("");
//                    Toast.makeText(MainActivity.this, "ALREADY EMPTY", Toast.LENGTH_SHORT).show();
                }else {
                    TV.setText("");
                    fTV.setText("");
                    Toast.makeText(MainActivity.this, "All Cleared", Toast.LENGTH_SHORT).show();
                }
            }
        });



        oneBTN = findViewById(R.id.oneBTN);
        oneBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String one = oneBTN.getText().toString();
                TextView oneTV;
                oneTV = findViewById(R.id.resultAREA);
                String og =  oneTV.getText().toString();
                oneTV.setText(og+one);
                
//                String s =  oneTV.getText().toString();

//                Toast.makeText(MainActivity.this, s, Toast.LENGTH_SHORT).show();
            }
        });

        twoBTN = findViewById(R.id.twoBTN);
        twoBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String two = twoBTN.getText().toString();
                TextView twoTV;
                twoTV = findViewById(R.id.resultAREA);
                String og =  twoTV.getText().toString();
                twoTV.setText(og+two);
//                String s =  oneTV.getText().toString();

//                Toast.makeText(MainActivity.this, s, Toast.LENGTH_SHORT).show();
            }
        });

        threeBTN = findViewById(R.id.threeBTN);
        threeBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String three = threeBTN.getText().toString();
                TextView threeTV;
                threeTV = findViewById(R.id.resultAREA);
                String og =  threeTV.getText().toString();
                threeTV.setText(og+three);
//                String s =  oneTV.getText().toString();

//                Toast.makeText(MainActivity.this, s, Toast.LENGTH_SHORT).show();
            }
        });

        fourBTN = findViewById(R.id.fourBTN);
        fourBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String four = fourBTN.getText().toString();
                TextView fourTV;
                fourTV = findViewById(R.id.resultAREA);
                String og =  fourTV.getText().toString();
                fourTV.setText(og+four);
//                String s =  oneTV.getText().toString();

//                Toast.makeText(MainActivity.this, s, Toast.LENGTH_SHORT).show();
            }
        });

        fiveBTN = findViewById(R.id.fiveBTN);
        fiveBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String five = fiveBTN.getText().toString();
                TextView fiveTV;
                fiveTV = findViewById(R.id.resultAREA);
                String og =  fiveTV.getText().toString();
                fiveTV.setText(og+five);
//                String s =  oneTV.getText().toString();

//                Toast.makeText(MainActivity.this, s, Toast.LENGTH_SHORT).show();
            }
        });


        sixBTN = findViewById(R.id.sixBTN);
        sixBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String six = sixBTN.getText().toString();
                TextView sixTV;
                sixTV = findViewById(R.id.resultAREA);
                String og =  sixTV.getText().toString();
                sixTV.setText(og+six);
//                String s =  oneTV.getText().toString();

//                Toast.makeText(MainActivity.this, s, Toast.LENGTH_SHORT).show();
            }
        });

        sevenBTN = findViewById(R.id.sevenBTN);
        sevenBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String seven = sevenBTN.getText().toString();
                TextView sevenTV;
                sevenTV = findViewById(R.id.resultAREA);
                String og =  sevenTV.getText().toString();
                sevenTV.setText(og+seven);
//                String s =  oneTV.getText().toString();

//                Toast.makeText(MainActivity.this, s, Toast.LENGTH_SHORT).show();
            }
        });

        eightBTN = findViewById(R.id.eightBTN);
        eightBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String eight = eightBTN.getText().toString();
                TextView eightTV;
                eightTV = findViewById(R.id.resultAREA);
                String og =  eightTV.getText().toString();
                eightTV.setText(og+eight);
//                String s =  oneTV.getText().toString();

//                Toast.makeText(MainActivity.this, s, Toast.LENGTH_SHORT).show();
            }
        });

        nineBTN = findViewById(R.id.nineBTN);
        nineBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nine = nineBTN.getText().toString();
                TextView nineTV;
                nineTV = findViewById(R.id.resultAREA);
                String og =  nineTV.getText().toString();
                nineTV.setText(og+nine);
//                String s =  oneTV.getText().toString();

//                Toast.makeText(MainActivity.this, s, Toast.LENGTH_SHORT).show();
            }
        });

        zeroBTN = findViewById(R.id.zeroBTN);
        zeroBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String zero = zeroBTN.getText().toString();
                TextView zeroTV;
                zeroTV = findViewById(R.id.resultAREA);
                String og =  zeroTV.getText().toString();
                zeroTV.setText(og+zero);

            }
        });

        openBracketBTN = findViewById(R.id.openBracketBTN);
        openBracketBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String openB = openBracketBTN.getText().toString();
                TextView openBTV;
                openBTV = findViewById(R.id.resultAREA);
                String og =  openBTV.getText().toString();
                openBTV.setText(og+openB);

            }
        });

        closeBracketBTN = findViewById(R.id.closeBracketBTN);
        closeBracketBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String closeB = closeBracketBTN.getText().toString();
                TextView closeBTV;
                closeBTV = findViewById(R.id.resultAREA);
                String og =  closeBTV.getText().toString();
                closeBTV.setText(og+closeB);

            }
        });
//========================================
        addBTN = findViewById(R.id.addBTN);
        addBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String add = addBTN.getText().toString();
                TextView addTV;
                addTV = findViewById(R.id.resultAREA);
                String og =  addTV.getText().toString();
                addTV.setText(og+add);
//                num1 = og;
//                String s =  oneTV.getText().toString();

//                Toast.makeText(MainActivity.this, og, Toast.LENGTH_SHORT).show();
            }
        });

        subBTN = findViewById(R.id.subBTN);
        subBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sub = subBTN.getText().toString();
                TextView subTV;
                subTV = findViewById(R.id.resultAREA);
                String og =  subTV.getText().toString();
                subTV.setText(og+sub);
//                num1 = og;
//                String s =  oneTV.getText().toString();

//                Toast.makeText(MainActivity.this, s, Toast.LENGTH_SHORT).show();
            }
        });

        mulBTN = findViewById(R.id.mulBTN);
        mulBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mul = mulBTN.getText().toString();
                TextView mulTV;
                mulTV = findViewById(R.id.resultAREA);
                String og =  mulTV.getText().toString();
                mulTV.setText(og+mul);
//                num1 = og;
//                String s =  oneTV.getText().toString();

//                Toast.makeText(MainActivity.this, s, Toast.LENGTH_SHORT).show();
            }
        });

        divBTN = findViewById(R.id.divBTN);
        divBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String div = divBTN.getText().toString();
                TextView divTV;
                divTV = findViewById(R.id.resultAREA);
                String og =  divTV.getText().toString();
                divTV.setText(og+div);
//                num1 = og;
//                String s =  oneTV.getText().toString();

//                Toast.makeText(MainActivity.this, s, Toast.LENGTH_SHORT).show();
            }
        });

        modBTN = findViewById(R.id.modBTN);
        modBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mod = modBTN.getText().toString();
                TextView modTV;
                modTV = findViewById(R.id.resultAREA);
                String og =  modTV.getText().toString();
                modTV.setText(og+mod);
//                num1 = og;
//                String s =  oneTV.getText().toString();

//                Toast.makeText(MainActivity.this, s, Toast.LENGTH_SHORT).show();
            }
        });

    }

}