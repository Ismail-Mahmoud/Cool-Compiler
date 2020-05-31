//import org.antlr.v4.runtime.ParserRuleContext;

public class coolvisitor extends CoolRulesBaseVisitor {


    @Override public Object visitProgram(CoolRulesParser.ProgramContext ctx) {
        System.out.println("");
        for (var classs: ctx.children) {
            visit(classs);
        }
        return "";
    }

    @Override public Object visitClassDefinition(CoolRulesParser.ClassDefinitionContext ctx) {
        String className = ctx.TYPE(0).getText();
        System.out.println(className + ":");
        visit(ctx.body());
        return "";
    }


    @Override public Object visitBody(CoolRulesParser.BodyContext ctx) {
        for (var child: ctx.children) {
            visit(child);
        }
        return "";
    }


    @Override public Object visitAttr(CoolRulesParser.AttrContext ctx) {
        if(ctx.getChildCount() > 4) {
            String className = ctx.TYPE().getText();
            String attrName = ctx.IDENTIFIER().getText();
            System.out.println("\t\t" + className + "." + attrName + " = " + visit(ctx.stmt()));
        }
        return "";
    }


    @Override public Object visitMethod(CoolRulesParser.MethodContext ctx) {
        String methodName = ctx.IDENTIFIER().getText();
        System.out.println("\t" + methodName + ":");
        System.out.println("\t\tBeginFunc;");
        visit(ctx.stmt());
        System.out.println("\t\tEndFunc;");
        return "";
    }


    @Override public Object visitParameter(CoolRulesParser.ParameterContext ctx) {
        System.out.println("\t\tPushParam " + ctx.IDENTIFIER().getText());
        return "";
    }


    @Override public Object visitNew(CoolRulesParser.NewContext ctx) {
        System.out.println("new " + ctx.TYPE().getText());
        return "";
    }


    @Override public Object visitIdentifier(CoolRulesParser.IdentifierContext ctx) {
        System.out.println("\t\t" + ctx.IDENTIFIER().getText());
        return "";
    }


    @Override public Object visitInvert(CoolRulesParser.InvertContext ctx) {

        return "";
    }


    @Override public Object visitString(CoolRulesParser.StringContext ctx) {
        System.out.println("\t\t" + ctx.STRING().getText());
        return "";
    }


    @Override public Object visitIsvoid(CoolRulesParser.IsvoidContext ctx) {
        return "";
    }


    @Override public Object visitWhile(CoolRulesParser.WhileContext ctx) {
        return "";
    }


    @Override public Object visitTilde(CoolRulesParser.TildeContext ctx) {
        return "";
    }


    @Override public Object visitInt(CoolRulesParser.IntContext ctx) {
        System.out.println("\t\t" + ctx.INTEGER().getText());
        return "";
    }


    @Override public Object visitMethodcall(CoolRulesParser.MethodcallContext ctx) {
        return "";
    }


    @Override public Object visitStatem(CoolRulesParser.StatemContext ctx) {
        return "";
    }


    @Override public Object visitCalling(CoolRulesParser.CallingContext ctx) {
        return "";
    }


    @Override public Object visitBlock(CoolRulesParser.BlockContext ctx) {
        return "";
    }


    @Override public Object visitLet(CoolRulesParser.LetContext ctx) {
        return "";
    }


    @Override public Object visitExpr(CoolRulesParser.ExprContext ctx) {
        return "";
    }


    @Override public Object visitIf(CoolRulesParser.IfContext ctx) {
        return "";
    }


    @Override public Object visitCase(CoolRulesParser.CaseContext ctx) {
        return "";
    }


    @Override public Object visitAssign(CoolRulesParser.AssignContext ctx) {
        return "";
    }

}