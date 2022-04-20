// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementOrStatementStatementAndStatementGetArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementOrStatementStatementByteMatchStatementGetArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementOrStatementStatementGeoMatchStatementGetArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementOrStatementStatementIpSetReferenceStatementGetArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementOrStatementStatementLabelMatchStatementGetArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementGetArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementGetArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementOrStatementStatementRegexPatternSetReferenceStatementGetArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementOrStatementStatementSizeConstraintStatementGetArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementOrStatementStatementSqliMatchStatementGetArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementAndStatementStatementOrStatementStatementXssMatchStatementGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAclRuleStatementAndStatementStatementOrStatementStatementGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementAndStatementStatementOrStatementStatementGetArgs Empty = new WebAclRuleStatementAndStatementStatementOrStatementStatementGetArgs();

    /**
     * A logical rule statement used to combine other rule statements with AND logic. See AND Statement below for details.
     * 
     */
    @Import(name="andStatement")
      private final @Nullable Output<WebAclRuleStatementAndStatementStatementOrStatementStatementAndStatementGetArgs> andStatement;

    public Output<WebAclRuleStatementAndStatementStatementOrStatementStatementAndStatementGetArgs> andStatement() {
        return this.andStatement == null ? Codegen.empty() : this.andStatement;
    }

    /**
     * A rule statement that defines a string match search for AWS WAF to apply to web requests. See Byte Match Statement below for details.
     * 
     */
    @Import(name="byteMatchStatement")
      private final @Nullable Output<WebAclRuleStatementAndStatementStatementOrStatementStatementByteMatchStatementGetArgs> byteMatchStatement;

    public Output<WebAclRuleStatementAndStatementStatementOrStatementStatementByteMatchStatementGetArgs> byteMatchStatement() {
        return this.byteMatchStatement == null ? Codegen.empty() : this.byteMatchStatement;
    }

    /**
     * A rule statement used to identify web requests based on country of origin. See GEO Match Statement below for details.
     * 
     */
    @Import(name="geoMatchStatement")
      private final @Nullable Output<WebAclRuleStatementAndStatementStatementOrStatementStatementGeoMatchStatementGetArgs> geoMatchStatement;

    public Output<WebAclRuleStatementAndStatementStatementOrStatementStatementGeoMatchStatementGetArgs> geoMatchStatement() {
        return this.geoMatchStatement == null ? Codegen.empty() : this.geoMatchStatement;
    }

    /**
     * A rule statement used to detect web requests coming from particular IP addresses or address ranges. See IP Set Reference Statement below for details.
     * 
     */
    @Import(name="ipSetReferenceStatement")
      private final @Nullable Output<WebAclRuleStatementAndStatementStatementOrStatementStatementIpSetReferenceStatementGetArgs> ipSetReferenceStatement;

    public Output<WebAclRuleStatementAndStatementStatementOrStatementStatementIpSetReferenceStatementGetArgs> ipSetReferenceStatement() {
        return this.ipSetReferenceStatement == null ? Codegen.empty() : this.ipSetReferenceStatement;
    }

    /**
     * A rule statement that defines a string match search against labels that have been added to the web request by rules that have already run in the web ACL. See Label Match Statement below for details.
     * 
     */
    @Import(name="labelMatchStatement")
      private final @Nullable Output<WebAclRuleStatementAndStatementStatementOrStatementStatementLabelMatchStatementGetArgs> labelMatchStatement;

    public Output<WebAclRuleStatementAndStatementStatementOrStatementStatementLabelMatchStatementGetArgs> labelMatchStatement() {
        return this.labelMatchStatement == null ? Codegen.empty() : this.labelMatchStatement;
    }

    /**
     * A logical rule statement used to negate the results of another rule statement. See NOT Statement below for details.
     * 
     */
    @Import(name="notStatement")
      private final @Nullable Output<WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementGetArgs> notStatement;

    public Output<WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementGetArgs> notStatement() {
        return this.notStatement == null ? Codegen.empty() : this.notStatement;
    }

    /**
     * A logical rule statement used to combine other rule statements with OR logic. See OR Statement below for details.
     * 
     */
    @Import(name="orStatement")
      private final @Nullable Output<WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementGetArgs> orStatement;

    public Output<WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementGetArgs> orStatement() {
        return this.orStatement == null ? Codegen.empty() : this.orStatement;
    }

    /**
     * A rule statement used to search web request components for matches with regular expressions. See Regex Pattern Set Reference Statement below for details.
     * 
     */
    @Import(name="regexPatternSetReferenceStatement")
      private final @Nullable Output<WebAclRuleStatementAndStatementStatementOrStatementStatementRegexPatternSetReferenceStatementGetArgs> regexPatternSetReferenceStatement;

    public Output<WebAclRuleStatementAndStatementStatementOrStatementStatementRegexPatternSetReferenceStatementGetArgs> regexPatternSetReferenceStatement() {
        return this.regexPatternSetReferenceStatement == null ? Codegen.empty() : this.regexPatternSetReferenceStatement;
    }

    /**
     * A rule statement that compares a number of bytes against the size of a request component, using a comparison operator, such as greater than (&gt;) or less than (&lt;). See Size Constraint Statement below for more details.
     * 
     */
    @Import(name="sizeConstraintStatement")
      private final @Nullable Output<WebAclRuleStatementAndStatementStatementOrStatementStatementSizeConstraintStatementGetArgs> sizeConstraintStatement;

    public Output<WebAclRuleStatementAndStatementStatementOrStatementStatementSizeConstraintStatementGetArgs> sizeConstraintStatement() {
        return this.sizeConstraintStatement == null ? Codegen.empty() : this.sizeConstraintStatement;
    }

    /**
     * An SQL injection match condition identifies the part of web requests, such as the URI or the query string, that you want AWS WAF to inspect. See SQL Injection Match Statement below for details.
     * 
     */
    @Import(name="sqliMatchStatement")
      private final @Nullable Output<WebAclRuleStatementAndStatementStatementOrStatementStatementSqliMatchStatementGetArgs> sqliMatchStatement;

    public Output<WebAclRuleStatementAndStatementStatementOrStatementStatementSqliMatchStatementGetArgs> sqliMatchStatement() {
        return this.sqliMatchStatement == null ? Codegen.empty() : this.sqliMatchStatement;
    }

    /**
     * A rule statement that defines a cross-site scripting (XSS) match search for AWS WAF to apply to web requests. See XSS Match Statement below for details.
     * 
     */
    @Import(name="xssMatchStatement")
      private final @Nullable Output<WebAclRuleStatementAndStatementStatementOrStatementStatementXssMatchStatementGetArgs> xssMatchStatement;

    public Output<WebAclRuleStatementAndStatementStatementOrStatementStatementXssMatchStatementGetArgs> xssMatchStatement() {
        return this.xssMatchStatement == null ? Codegen.empty() : this.xssMatchStatement;
    }

    public WebAclRuleStatementAndStatementStatementOrStatementStatementGetArgs(
        @Nullable Output<WebAclRuleStatementAndStatementStatementOrStatementStatementAndStatementGetArgs> andStatement,
        @Nullable Output<WebAclRuleStatementAndStatementStatementOrStatementStatementByteMatchStatementGetArgs> byteMatchStatement,
        @Nullable Output<WebAclRuleStatementAndStatementStatementOrStatementStatementGeoMatchStatementGetArgs> geoMatchStatement,
        @Nullable Output<WebAclRuleStatementAndStatementStatementOrStatementStatementIpSetReferenceStatementGetArgs> ipSetReferenceStatement,
        @Nullable Output<WebAclRuleStatementAndStatementStatementOrStatementStatementLabelMatchStatementGetArgs> labelMatchStatement,
        @Nullable Output<WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementGetArgs> notStatement,
        @Nullable Output<WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementGetArgs> orStatement,
        @Nullable Output<WebAclRuleStatementAndStatementStatementOrStatementStatementRegexPatternSetReferenceStatementGetArgs> regexPatternSetReferenceStatement,
        @Nullable Output<WebAclRuleStatementAndStatementStatementOrStatementStatementSizeConstraintStatementGetArgs> sizeConstraintStatement,
        @Nullable Output<WebAclRuleStatementAndStatementStatementOrStatementStatementSqliMatchStatementGetArgs> sqliMatchStatement,
        @Nullable Output<WebAclRuleStatementAndStatementStatementOrStatementStatementXssMatchStatementGetArgs> xssMatchStatement) {
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

    private WebAclRuleStatementAndStatementStatementOrStatementStatementGetArgs() {
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

    public static Builder builder(WebAclRuleStatementAndStatementStatementOrStatementStatementGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<WebAclRuleStatementAndStatementStatementOrStatementStatementAndStatementGetArgs> andStatement;
        private @Nullable Output<WebAclRuleStatementAndStatementStatementOrStatementStatementByteMatchStatementGetArgs> byteMatchStatement;
        private @Nullable Output<WebAclRuleStatementAndStatementStatementOrStatementStatementGeoMatchStatementGetArgs> geoMatchStatement;
        private @Nullable Output<WebAclRuleStatementAndStatementStatementOrStatementStatementIpSetReferenceStatementGetArgs> ipSetReferenceStatement;
        private @Nullable Output<WebAclRuleStatementAndStatementStatementOrStatementStatementLabelMatchStatementGetArgs> labelMatchStatement;
        private @Nullable Output<WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementGetArgs> notStatement;
        private @Nullable Output<WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementGetArgs> orStatement;
        private @Nullable Output<WebAclRuleStatementAndStatementStatementOrStatementStatementRegexPatternSetReferenceStatementGetArgs> regexPatternSetReferenceStatement;
        private @Nullable Output<WebAclRuleStatementAndStatementStatementOrStatementStatementSizeConstraintStatementGetArgs> sizeConstraintStatement;
        private @Nullable Output<WebAclRuleStatementAndStatementStatementOrStatementStatementSqliMatchStatementGetArgs> sqliMatchStatement;
        private @Nullable Output<WebAclRuleStatementAndStatementStatementOrStatementStatementXssMatchStatementGetArgs> xssMatchStatement;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementAndStatementStatementOrStatementStatementGetArgs defaults) {
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

        public Builder andStatement(@Nullable Output<WebAclRuleStatementAndStatementStatementOrStatementStatementAndStatementGetArgs> andStatement) {
            this.andStatement = andStatement;
            return this;
        }
        public Builder andStatement(@Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementAndStatementGetArgs andStatement) {
            this.andStatement = Codegen.ofNullable(andStatement);
            return this;
        }
        public Builder byteMatchStatement(@Nullable Output<WebAclRuleStatementAndStatementStatementOrStatementStatementByteMatchStatementGetArgs> byteMatchStatement) {
            this.byteMatchStatement = byteMatchStatement;
            return this;
        }
        public Builder byteMatchStatement(@Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementByteMatchStatementGetArgs byteMatchStatement) {
            this.byteMatchStatement = Codegen.ofNullable(byteMatchStatement);
            return this;
        }
        public Builder geoMatchStatement(@Nullable Output<WebAclRuleStatementAndStatementStatementOrStatementStatementGeoMatchStatementGetArgs> geoMatchStatement) {
            this.geoMatchStatement = geoMatchStatement;
            return this;
        }
        public Builder geoMatchStatement(@Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementGeoMatchStatementGetArgs geoMatchStatement) {
            this.geoMatchStatement = Codegen.ofNullable(geoMatchStatement);
            return this;
        }
        public Builder ipSetReferenceStatement(@Nullable Output<WebAclRuleStatementAndStatementStatementOrStatementStatementIpSetReferenceStatementGetArgs> ipSetReferenceStatement) {
            this.ipSetReferenceStatement = ipSetReferenceStatement;
            return this;
        }
        public Builder ipSetReferenceStatement(@Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementIpSetReferenceStatementGetArgs ipSetReferenceStatement) {
            this.ipSetReferenceStatement = Codegen.ofNullable(ipSetReferenceStatement);
            return this;
        }
        public Builder labelMatchStatement(@Nullable Output<WebAclRuleStatementAndStatementStatementOrStatementStatementLabelMatchStatementGetArgs> labelMatchStatement) {
            this.labelMatchStatement = labelMatchStatement;
            return this;
        }
        public Builder labelMatchStatement(@Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementLabelMatchStatementGetArgs labelMatchStatement) {
            this.labelMatchStatement = Codegen.ofNullable(labelMatchStatement);
            return this;
        }
        public Builder notStatement(@Nullable Output<WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementGetArgs> notStatement) {
            this.notStatement = notStatement;
            return this;
        }
        public Builder notStatement(@Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementNotStatementGetArgs notStatement) {
            this.notStatement = Codegen.ofNullable(notStatement);
            return this;
        }
        public Builder orStatement(@Nullable Output<WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementGetArgs> orStatement) {
            this.orStatement = orStatement;
            return this;
        }
        public Builder orStatement(@Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementOrStatementGetArgs orStatement) {
            this.orStatement = Codegen.ofNullable(orStatement);
            return this;
        }
        public Builder regexPatternSetReferenceStatement(@Nullable Output<WebAclRuleStatementAndStatementStatementOrStatementStatementRegexPatternSetReferenceStatementGetArgs> regexPatternSetReferenceStatement) {
            this.regexPatternSetReferenceStatement = regexPatternSetReferenceStatement;
            return this;
        }
        public Builder regexPatternSetReferenceStatement(@Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementRegexPatternSetReferenceStatementGetArgs regexPatternSetReferenceStatement) {
            this.regexPatternSetReferenceStatement = Codegen.ofNullable(regexPatternSetReferenceStatement);
            return this;
        }
        public Builder sizeConstraintStatement(@Nullable Output<WebAclRuleStatementAndStatementStatementOrStatementStatementSizeConstraintStatementGetArgs> sizeConstraintStatement) {
            this.sizeConstraintStatement = sizeConstraintStatement;
            return this;
        }
        public Builder sizeConstraintStatement(@Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementSizeConstraintStatementGetArgs sizeConstraintStatement) {
            this.sizeConstraintStatement = Codegen.ofNullable(sizeConstraintStatement);
            return this;
        }
        public Builder sqliMatchStatement(@Nullable Output<WebAclRuleStatementAndStatementStatementOrStatementStatementSqliMatchStatementGetArgs> sqliMatchStatement) {
            this.sqliMatchStatement = sqliMatchStatement;
            return this;
        }
        public Builder sqliMatchStatement(@Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementSqliMatchStatementGetArgs sqliMatchStatement) {
            this.sqliMatchStatement = Codegen.ofNullable(sqliMatchStatement);
            return this;
        }
        public Builder xssMatchStatement(@Nullable Output<WebAclRuleStatementAndStatementStatementOrStatementStatementXssMatchStatementGetArgs> xssMatchStatement) {
            this.xssMatchStatement = xssMatchStatement;
            return this;
        }
        public Builder xssMatchStatement(@Nullable WebAclRuleStatementAndStatementStatementOrStatementStatementXssMatchStatementGetArgs xssMatchStatement) {
            this.xssMatchStatement = Codegen.ofNullable(xssMatchStatement);
            return this;
        }        public WebAclRuleStatementAndStatementStatementOrStatementStatementGetArgs build() {
            return new WebAclRuleStatementAndStatementStatementOrStatementStatementGetArgs(andStatement, byteMatchStatement, geoMatchStatement, ipSetReferenceStatement, labelMatchStatement, notStatement, orStatement, regexPatternSetReferenceStatement, sizeConstraintStatement, sqliMatchStatement, xssMatchStatement);
        }
    }
}
