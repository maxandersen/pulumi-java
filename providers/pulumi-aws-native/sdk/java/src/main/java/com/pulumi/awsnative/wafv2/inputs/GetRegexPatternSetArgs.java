// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.wafv2.inputs;

import com.pulumi.awsnative.wafv2.enums.RegexPatternSetScope;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetRegexPatternSetArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetRegexPatternSetArgs Empty = new GetRegexPatternSetArgs();

    /**
     * Id of the RegexPatternSet
     * 
     */
    @Import(name="id", required=true)
      private final String id;

    public String id() {
        return this.id;
    }

    /**
     * Name of the RegexPatternSet.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    /**
     * Use CLOUDFRONT for CloudFront RegexPatternSet, use REGIONAL for Application Load Balancer and API Gateway.
     * 
     */
    @Import(name="scope", required=true)
      private final RegexPatternSetScope scope;

    public RegexPatternSetScope scope() {
        return this.scope;
    }

    public GetRegexPatternSetArgs(
        String id,
        String name,
        RegexPatternSetScope scope) {
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.scope = Objects.requireNonNull(scope, "expected parameter 'scope' to be non-null");
    }

    private GetRegexPatternSetArgs() {
        this.id = null;
        this.name = null;
        this.scope = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegexPatternSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String name;
        private RegexPatternSetScope scope;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRegexPatternSetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.scope = defaults.scope;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder scope(RegexPatternSetScope scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }        public GetRegexPatternSetArgs build() {
            return new GetRegexPatternSetArgs(id, name, scope);
        }
    }
}
