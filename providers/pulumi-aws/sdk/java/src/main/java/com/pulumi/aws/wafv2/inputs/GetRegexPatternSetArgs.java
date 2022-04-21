// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.wafv2.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetRegexPatternSetArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRegexPatternSetArgs Empty = new GetRegexPatternSetArgs();

    /**
     * The name of the WAFv2 Regex Pattern Set.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    public String name() {
        return this.name;
    }

    /**
     * Specifies whether this is for an AWS CloudFront distribution or for a regional application. Valid values are `CLOUDFRONT` or `REGIONAL`. To work with CloudFront, you must also specify the region `us-east-1` (N. Virginia) on the AWS provider.
     * 
     */
    @Import(name="scope", required=true)
    private String scope;

    public String scope() {
        return this.scope;
    }

    private GetRegexPatternSetArgs() {}

    private GetRegexPatternSetArgs(GetRegexPatternSetArgs $) {
        this.name = $.name;
        this.scope = $.scope;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetRegexPatternSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetRegexPatternSetArgs $;

        public Builder() {
            $ = new GetRegexPatternSetArgs();
        }

        public Builder(GetRegexPatternSetArgs defaults) {
            $ = new GetRegexPatternSetArgs(Objects.requireNonNull(defaults));
        }

        public Builder name(String name) {
            $.name = name;
            return this;
        }

        public Builder scope(String scope) {
            $.scope = scope;
            return this;
        }

        public GetRegexPatternSetArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            $.scope = Objects.requireNonNull($.scope, "expected parameter 'scope' to be non-null");
            return $;
        }
    }

}
