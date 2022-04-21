// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementAndStatementGetArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementByteMatchStatementGetArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementGeoMatchStatementGetArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementIpSetReferenceStatementGetArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementLabelMatchStatementGetArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementNotStatementGetArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementOrStatementGetArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementRegexPatternSetReferenceStatementGetArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementSizeConstraintStatementGetArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementSqliMatchStatementGetArgs;
import com.pulumi.aws.wafv2.inputs.WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementXssMatchStatementGetArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementGetArgs extends com.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementGetArgs Empty = new WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementGetArgs();

    /**
     * A logical rule statement used to combine other rule statements with AND logic. See AND Statement below for details.
     * 
     */
    @Import(name="andStatement")
    private @Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementAndStatementGetArgs> andStatement;

    public Optional<Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementAndStatementGetArgs>> andStatement() {
        return Optional.ofNullable(this.andStatement);
    }

    /**
     * A rule statement that defines a string match search for AWS WAF to apply to web requests. See Byte Match Statement below for details.
     * 
     */
    @Import(name="byteMatchStatement")
    private @Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementByteMatchStatementGetArgs> byteMatchStatement;

    public Optional<Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementByteMatchStatementGetArgs>> byteMatchStatement() {
        return Optional.ofNullable(this.byteMatchStatement);
    }

    /**
     * A rule statement used to identify web requests based on country of origin. See GEO Match Statement below for details.
     * 
     */
    @Import(name="geoMatchStatement")
    private @Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementGeoMatchStatementGetArgs> geoMatchStatement;

    public Optional<Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementGeoMatchStatementGetArgs>> geoMatchStatement() {
        return Optional.ofNullable(this.geoMatchStatement);
    }

    /**
     * A rule statement used to detect web requests coming from particular IP addresses or address ranges. See IP Set Reference Statement below for details.
     * 
     */
    @Import(name="ipSetReferenceStatement")
    private @Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementIpSetReferenceStatementGetArgs> ipSetReferenceStatement;

    public Optional<Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementIpSetReferenceStatementGetArgs>> ipSetReferenceStatement() {
        return Optional.ofNullable(this.ipSetReferenceStatement);
    }

    /**
     * A rule statement that defines a string match search against labels that have been added to the web request by rules that have already run in the web ACL. See Label Match Statement below for details.
     * 
     */
    @Import(name="labelMatchStatement")
    private @Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementLabelMatchStatementGetArgs> labelMatchStatement;

    public Optional<Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementLabelMatchStatementGetArgs>> labelMatchStatement() {
        return Optional.ofNullable(this.labelMatchStatement);
    }

    /**
     * A logical rule statement used to negate the results of another rule statement. See NOT Statement below for details.
     * 
     */
    @Import(name="notStatement")
    private @Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementNotStatementGetArgs> notStatement;

    public Optional<Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementNotStatementGetArgs>> notStatement() {
        return Optional.ofNullable(this.notStatement);
    }

    /**
     * A logical rule statement used to combine other rule statements with OR logic. See OR Statement below for details.
     * 
     */
    @Import(name="orStatement")
    private @Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementOrStatementGetArgs> orStatement;

    public Optional<Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementOrStatementGetArgs>> orStatement() {
        return Optional.ofNullable(this.orStatement);
    }

    /**
     * A rule statement used to search web request components for matches with regular expressions. See Regex Pattern Set Reference Statement below for details.
     * 
     */
    @Import(name="regexPatternSetReferenceStatement")
    private @Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementRegexPatternSetReferenceStatementGetArgs> regexPatternSetReferenceStatement;

    public Optional<Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementRegexPatternSetReferenceStatementGetArgs>> regexPatternSetReferenceStatement() {
        return Optional.ofNullable(this.regexPatternSetReferenceStatement);
    }

    /**
     * A rule statement that compares a number of bytes against the size of a request component, using a comparison operator, such as greater than (&gt;) or less than (&lt;). See Size Constraint Statement below for more details.
     * 
     */
    @Import(name="sizeConstraintStatement")
    private @Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementSizeConstraintStatementGetArgs> sizeConstraintStatement;

    public Optional<Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementSizeConstraintStatementGetArgs>> sizeConstraintStatement() {
        return Optional.ofNullable(this.sizeConstraintStatement);
    }

    /**
     * An SQL injection match condition identifies the part of web requests, such as the URI or the query string, that you want AWS WAF to inspect. See SQL Injection Match Statement below for details.
     * 
     */
    @Import(name="sqliMatchStatement")
    private @Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementSqliMatchStatementGetArgs> sqliMatchStatement;

    public Optional<Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementSqliMatchStatementGetArgs>> sqliMatchStatement() {
        return Optional.ofNullable(this.sqliMatchStatement);
    }

    /**
     * A rule statement that defines a cross-site scripting (XSS) match search for AWS WAF to apply to web requests. See XSS Match Statement below for details.
     * 
     */
    @Import(name="xssMatchStatement")
    private @Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementXssMatchStatementGetArgs> xssMatchStatement;

    public Optional<Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementXssMatchStatementGetArgs>> xssMatchStatement() {
        return Optional.ofNullable(this.xssMatchStatement);
    }

    private WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementGetArgs() {}

    private WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementGetArgs(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementGetArgs $) {
        this.andStatement = $.andStatement;
        this.byteMatchStatement = $.byteMatchStatement;
        this.geoMatchStatement = $.geoMatchStatement;
        this.ipSetReferenceStatement = $.ipSetReferenceStatement;
        this.labelMatchStatement = $.labelMatchStatement;
        this.notStatement = $.notStatement;
        this.orStatement = $.orStatement;
        this.regexPatternSetReferenceStatement = $.regexPatternSetReferenceStatement;
        this.sizeConstraintStatement = $.sizeConstraintStatement;
        this.sqliMatchStatement = $.sqliMatchStatement;
        this.xssMatchStatement = $.xssMatchStatement;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementGetArgs $;

        public Builder() {
            $ = new WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementGetArgs();
        }

        public Builder(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementGetArgs defaults) {
            $ = new WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementGetArgs(Objects.requireNonNull(defaults));
        }

        public Builder andStatement(@Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementAndStatementGetArgs> andStatement) {
            $.andStatement = andStatement;
            return this;
        }

        public Builder andStatement(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementAndStatementGetArgs andStatement) {
            return andStatement(Output.of(andStatement));
        }

        public Builder byteMatchStatement(@Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementByteMatchStatementGetArgs> byteMatchStatement) {
            $.byteMatchStatement = byteMatchStatement;
            return this;
        }

        public Builder byteMatchStatement(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementByteMatchStatementGetArgs byteMatchStatement) {
            return byteMatchStatement(Output.of(byteMatchStatement));
        }

        public Builder geoMatchStatement(@Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementGeoMatchStatementGetArgs> geoMatchStatement) {
            $.geoMatchStatement = geoMatchStatement;
            return this;
        }

        public Builder geoMatchStatement(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementGeoMatchStatementGetArgs geoMatchStatement) {
            return geoMatchStatement(Output.of(geoMatchStatement));
        }

        public Builder ipSetReferenceStatement(@Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementIpSetReferenceStatementGetArgs> ipSetReferenceStatement) {
            $.ipSetReferenceStatement = ipSetReferenceStatement;
            return this;
        }

        public Builder ipSetReferenceStatement(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementIpSetReferenceStatementGetArgs ipSetReferenceStatement) {
            return ipSetReferenceStatement(Output.of(ipSetReferenceStatement));
        }

        public Builder labelMatchStatement(@Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementLabelMatchStatementGetArgs> labelMatchStatement) {
            $.labelMatchStatement = labelMatchStatement;
            return this;
        }

        public Builder labelMatchStatement(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementLabelMatchStatementGetArgs labelMatchStatement) {
            return labelMatchStatement(Output.of(labelMatchStatement));
        }

        public Builder notStatement(@Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementNotStatementGetArgs> notStatement) {
            $.notStatement = notStatement;
            return this;
        }

        public Builder notStatement(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementNotStatementGetArgs notStatement) {
            return notStatement(Output.of(notStatement));
        }

        public Builder orStatement(@Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementOrStatementGetArgs> orStatement) {
            $.orStatement = orStatement;
            return this;
        }

        public Builder orStatement(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementOrStatementGetArgs orStatement) {
            return orStatement(Output.of(orStatement));
        }

        public Builder regexPatternSetReferenceStatement(@Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementRegexPatternSetReferenceStatementGetArgs> regexPatternSetReferenceStatement) {
            $.regexPatternSetReferenceStatement = regexPatternSetReferenceStatement;
            return this;
        }

        public Builder regexPatternSetReferenceStatement(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementRegexPatternSetReferenceStatementGetArgs regexPatternSetReferenceStatement) {
            return regexPatternSetReferenceStatement(Output.of(regexPatternSetReferenceStatement));
        }

        public Builder sizeConstraintStatement(@Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementSizeConstraintStatementGetArgs> sizeConstraintStatement) {
            $.sizeConstraintStatement = sizeConstraintStatement;
            return this;
        }

        public Builder sizeConstraintStatement(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementSizeConstraintStatementGetArgs sizeConstraintStatement) {
            return sizeConstraintStatement(Output.of(sizeConstraintStatement));
        }

        public Builder sqliMatchStatement(@Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementSqliMatchStatementGetArgs> sqliMatchStatement) {
            $.sqliMatchStatement = sqliMatchStatement;
            return this;
        }

        public Builder sqliMatchStatement(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementSqliMatchStatementGetArgs sqliMatchStatement) {
            return sqliMatchStatement(Output.of(sqliMatchStatement));
        }

        public Builder xssMatchStatement(@Nullable Output<WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementXssMatchStatementGetArgs> xssMatchStatement) {
            $.xssMatchStatement = xssMatchStatement;
            return this;
        }

        public Builder xssMatchStatement(WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementXssMatchStatementGetArgs xssMatchStatement) {
            return xssMatchStatement(Output.of(xssMatchStatement));
        }

        public WebAclRuleStatementManagedRuleGroupStatementScopeDownStatementNotStatementStatementGetArgs build() {
            return $;
        }
    }

}
