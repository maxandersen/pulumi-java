// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementGetArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementOrStatementStatementByteMatchStatementGetArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementOrStatementStatementGeoMatchStatementGetArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementOrStatementStatementIpSetReferenceStatementGetArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementOrStatementStatementLabelMatchStatementGetArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementGetArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementGetArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementGetArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementOrStatementStatementSizeConstraintStatementGetArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementOrStatementStatementSqliMatchStatementGetArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclRuleStatementOrStatementStatementOrStatementStatementGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementOrStatementStatementOrStatementStatementGetArgs Empty = new WebAclRuleStatementOrStatementStatementOrStatementStatementGetArgs();

    /**
     * A logical rule statement used to combine other rule statements with AND logic. See AND Statement below for details.
     * 
     */
    @Import(name="andStatement")
      private final @Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementGetArgs> andStatement;

    public Output<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementGetArgs> andStatement() {
        return this.andStatement == null ? Codegen.empty() : this.andStatement;
    }

    /**
     * A rule statement that defines a string match search for AWS WAF to apply to web requests. See Byte Match Statement below for details.
     * 
     */
    @Import(name="byteMatchStatement")
      private final @Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementByteMatchStatementGetArgs> byteMatchStatement;

    public Output<WebAclRuleStatementOrStatementStatementOrStatementStatementByteMatchStatementGetArgs> byteMatchStatement() {
        return this.byteMatchStatement == null ? Codegen.empty() : this.byteMatchStatement;
    }

    /**
     * A rule statement used to identify web requests based on country of origin. See GEO Match Statement below for details.
     * 
     */
    @Import(name="geoMatchStatement")
      private final @Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementGeoMatchStatementGetArgs> geoMatchStatement;

    public Output<WebAclRuleStatementOrStatementStatementOrStatementStatementGeoMatchStatementGetArgs> geoMatchStatement() {
        return this.geoMatchStatement == null ? Codegen.empty() : this.geoMatchStatement;
    }

    /**
     * A rule statement used to detect web requests coming from particular IP addresses or address ranges. See IP Set Reference Statement below for details.
     * 
     */
    @Import(name="ipSetReferenceStatement")
      private final @Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementIpSetReferenceStatementGetArgs> ipSetReferenceStatement;

    public Output<WebAclRuleStatementOrStatementStatementOrStatementStatementIpSetReferenceStatementGetArgs> ipSetReferenceStatement() {
        return this.ipSetReferenceStatement == null ? Codegen.empty() : this.ipSetReferenceStatement;
    }

    /**
     * A rule statement that defines a string match search against labels that have been added to the web request by rules that have already run in the web ACL. See Label Match Statement below for details.
     * 
     */
    @Import(name="labelMatchStatement")
      private final @Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementLabelMatchStatementGetArgs> labelMatchStatement;

    public Output<WebAclRuleStatementOrStatementStatementOrStatementStatementLabelMatchStatementGetArgs> labelMatchStatement() {
        return this.labelMatchStatement == null ? Codegen.empty() : this.labelMatchStatement;
    }

    /**
     * A logical rule statement used to negate the results of another rule statement. See NOT Statement below for details.
     * 
     */
    @Import(name="notStatement")
      private final @Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementGetArgs> notStatement;

    public Output<WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementGetArgs> notStatement() {
        return this.notStatement == null ? Codegen.empty() : this.notStatement;
    }

    /**
     * A logical rule statement used to combine other rule statements with OR logic. See OR Statement below for details.
     * 
     */
    @Import(name="orStatement")
      private final @Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementGetArgs> orStatement;

    public Output<WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementGetArgs> orStatement() {
        return this.orStatement == null ? Codegen.empty() : this.orStatement;
    }

    /**
     * A rule statement used to search web request components for matches with regular expressions. See Regex Pattern Set Reference Statement below for details.
     * 
     */
    @Import(name="regexPatternSetReferenceStatement")
      private final @Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementGetArgs> regexPatternSetReferenceStatement;

    public Output<WebAclRuleStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementGetArgs> regexPatternSetReferenceStatement() {
        return this.regexPatternSetReferenceStatement == null ? Codegen.empty() : this.regexPatternSetReferenceStatement;
    }

    /**
     * A rule statement that compares a number of bytes against the size of a request component, using a comparison operator, such as greater than (&gt;) or less than (&lt;). See Size Constraint Statement below for more details.
     * 
     */
    @Import(name="sizeConstraintStatement")
      private final @Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementSizeConstraintStatementGetArgs> sizeConstraintStatement;

    public Output<WebAclRuleStatementOrStatementStatementOrStatementStatementSizeConstraintStatementGetArgs> sizeConstraintStatement() {
        return this.sizeConstraintStatement == null ? Codegen.empty() : this.sizeConstraintStatement;
    }

    /**
     * An SQL injection match condition identifies the part of web requests, such as the URI or the query string, that you want AWS WAF to inspect. See SQL Injection Match Statement below for details.
     * 
     */
    @Import(name="sqliMatchStatement")
      private final @Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementSqliMatchStatementGetArgs> sqliMatchStatement;

    public Output<WebAclRuleStatementOrStatementStatementOrStatementStatementSqliMatchStatementGetArgs> sqliMatchStatement() {
        return this.sqliMatchStatement == null ? Codegen.empty() : this.sqliMatchStatement;
    }

    /**
     * A rule statement that defines a cross-site scripting (XSS) match search for AWS WAF to apply to web requests. See XSS Match Statement below for details.
     * 
     */
    @Import(name="xssMatchStatement")
      private final @Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementGetArgs> xssMatchStatement;

    public Output<WebAclRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementGetArgs> xssMatchStatement() {
        return this.xssMatchStatement == null ? Codegen.empty() : this.xssMatchStatement;
    }

    public WebAclRuleStatementOrStatementStatementOrStatementStatementGetArgs(
        @Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementGetArgs> andStatement,
        @Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementByteMatchStatementGetArgs> byteMatchStatement,
        @Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementGeoMatchStatementGetArgs> geoMatchStatement,
        @Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementIpSetReferenceStatementGetArgs> ipSetReferenceStatement,
        @Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementLabelMatchStatementGetArgs> labelMatchStatement,
        @Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementGetArgs> notStatement,
        @Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementGetArgs> orStatement,
        @Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementGetArgs> regexPatternSetReferenceStatement,
        @Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementSizeConstraintStatementGetArgs> sizeConstraintStatement,
        @Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementSqliMatchStatementGetArgs> sqliMatchStatement,
        @Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementGetArgs> xssMatchStatement) {
        this.andStatement = andStatement;
        this.byteMatchStatement = byteMatchStatement;
        this.geoMatchStatement = geoMatchStatement;
        this.ipSetReferenceStatement = ipSetReferenceStatement;
        this.labelMatchStatement = labelMatchStatement;
        this.notStatement = notStatement;
        this.orStatement = orStatement;
        this.regexPatternSetReferenceStatement = regexPatternSetReferenceStatement;
        this.sizeConstraintStatement = sizeConstraintStatement;
        this.sqliMatchStatement = sqliMatchStatement;
        this.xssMatchStatement = xssMatchStatement;
    }

    private WebAclRuleStatementOrStatementStatementOrStatementStatementGetArgs() {
        this.andStatement = Codegen.empty();
        this.byteMatchStatement = Codegen.empty();
        this.geoMatchStatement = Codegen.empty();
        this.ipSetReferenceStatement = Codegen.empty();
        this.labelMatchStatement = Codegen.empty();
        this.notStatement = Codegen.empty();
        this.orStatement = Codegen.empty();
        this.regexPatternSetReferenceStatement = Codegen.empty();
        this.sizeConstraintStatement = Codegen.empty();
        this.sqliMatchStatement = Codegen.empty();
        this.xssMatchStatement = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementOrStatementStatementOrStatementStatementGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementGetArgs> andStatement;
        private @Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementByteMatchStatementGetArgs> byteMatchStatement;
        private @Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementGeoMatchStatementGetArgs> geoMatchStatement;
        private @Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementIpSetReferenceStatementGetArgs> ipSetReferenceStatement;
        private @Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementLabelMatchStatementGetArgs> labelMatchStatement;
        private @Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementGetArgs> notStatement;
        private @Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementGetArgs> orStatement;
        private @Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementGetArgs> regexPatternSetReferenceStatement;
        private @Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementSizeConstraintStatementGetArgs> sizeConstraintStatement;
        private @Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementSqliMatchStatementGetArgs> sqliMatchStatement;
        private @Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementGetArgs> xssMatchStatement;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementOrStatementStatementOrStatementStatementGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.andStatement = defaults.andStatement;
    	      this.byteMatchStatement = defaults.byteMatchStatement;
    	      this.geoMatchStatement = defaults.geoMatchStatement;
    	      this.ipSetReferenceStatement = defaults.ipSetReferenceStatement;
    	      this.labelMatchStatement = defaults.labelMatchStatement;
    	      this.notStatement = defaults.notStatement;
    	      this.orStatement = defaults.orStatement;
    	      this.regexPatternSetReferenceStatement = defaults.regexPatternSetReferenceStatement;
    	      this.sizeConstraintStatement = defaults.sizeConstraintStatement;
    	      this.sqliMatchStatement = defaults.sqliMatchStatement;
    	      this.xssMatchStatement = defaults.xssMatchStatement;
        }

        public Builder andStatement(@Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementGetArgs> andStatement) {
            this.andStatement = andStatement;
            return this;
        }
        public Builder andStatement(@Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementAndStatementGetArgs andStatement) {
            this.andStatement = Codegen.ofNullable(andStatement);
            return this;
        }
        public Builder byteMatchStatement(@Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementByteMatchStatementGetArgs> byteMatchStatement) {
            this.byteMatchStatement = byteMatchStatement;
            return this;
        }
        public Builder byteMatchStatement(@Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementByteMatchStatementGetArgs byteMatchStatement) {
            this.byteMatchStatement = Codegen.ofNullable(byteMatchStatement);
            return this;
        }
        public Builder geoMatchStatement(@Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementGeoMatchStatementGetArgs> geoMatchStatement) {
            this.geoMatchStatement = geoMatchStatement;
            return this;
        }
        public Builder geoMatchStatement(@Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementGeoMatchStatementGetArgs geoMatchStatement) {
            this.geoMatchStatement = Codegen.ofNullable(geoMatchStatement);
            return this;
        }
        public Builder ipSetReferenceStatement(@Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementIpSetReferenceStatementGetArgs> ipSetReferenceStatement) {
            this.ipSetReferenceStatement = ipSetReferenceStatement;
            return this;
        }
        public Builder ipSetReferenceStatement(@Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementIpSetReferenceStatementGetArgs ipSetReferenceStatement) {
            this.ipSetReferenceStatement = Codegen.ofNullable(ipSetReferenceStatement);
            return this;
        }
        public Builder labelMatchStatement(@Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementLabelMatchStatementGetArgs> labelMatchStatement) {
            this.labelMatchStatement = labelMatchStatement;
            return this;
        }
        public Builder labelMatchStatement(@Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementLabelMatchStatementGetArgs labelMatchStatement) {
            this.labelMatchStatement = Codegen.ofNullable(labelMatchStatement);
            return this;
        }
        public Builder notStatement(@Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementGetArgs> notStatement) {
            this.notStatement = notStatement;
            return this;
        }
        public Builder notStatement(@Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementNotStatementGetArgs notStatement) {
            this.notStatement = Codegen.ofNullable(notStatement);
            return this;
        }
        public Builder orStatement(@Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementGetArgs> orStatement) {
            this.orStatement = orStatement;
            return this;
        }
        public Builder orStatement(@Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementOrStatementGetArgs orStatement) {
            this.orStatement = Codegen.ofNullable(orStatement);
            return this;
        }
        public Builder regexPatternSetReferenceStatement(@Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementGetArgs> regexPatternSetReferenceStatement) {
            this.regexPatternSetReferenceStatement = regexPatternSetReferenceStatement;
            return this;
        }
        public Builder regexPatternSetReferenceStatement(@Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementRegexPatternSetReferenceStatementGetArgs regexPatternSetReferenceStatement) {
            this.regexPatternSetReferenceStatement = Codegen.ofNullable(regexPatternSetReferenceStatement);
            return this;
        }
        public Builder sizeConstraintStatement(@Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementSizeConstraintStatementGetArgs> sizeConstraintStatement) {
            this.sizeConstraintStatement = sizeConstraintStatement;
            return this;
        }
        public Builder sizeConstraintStatement(@Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementSizeConstraintStatementGetArgs sizeConstraintStatement) {
            this.sizeConstraintStatement = Codegen.ofNullable(sizeConstraintStatement);
            return this;
        }
        public Builder sqliMatchStatement(@Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementSqliMatchStatementGetArgs> sqliMatchStatement) {
            this.sqliMatchStatement = sqliMatchStatement;
            return this;
        }
        public Builder sqliMatchStatement(@Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementSqliMatchStatementGetArgs sqliMatchStatement) {
            this.sqliMatchStatement = Codegen.ofNullable(sqliMatchStatement);
            return this;
        }
        public Builder xssMatchStatement(@Nullable Output<WebAclRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementGetArgs> xssMatchStatement) {
            this.xssMatchStatement = xssMatchStatement;
            return this;
        }
        public Builder xssMatchStatement(@Nullable WebAclRuleStatementOrStatementStatementOrStatementStatementXssMatchStatementGetArgs xssMatchStatement) {
            this.xssMatchStatement = Codegen.ofNullable(xssMatchStatement);
            return this;
        }        public WebAclRuleStatementOrStatementStatementOrStatementStatementGetArgs build() {
            return new WebAclRuleStatementOrStatementStatementOrStatementStatementGetArgs(andStatement, byteMatchStatement, geoMatchStatement, ipSetReferenceStatement, labelMatchStatement, notStatement, orStatement, regexPatternSetReferenceStatement, sizeConstraintStatement, sqliMatchStatement, xssMatchStatement);
        }
    }
}
