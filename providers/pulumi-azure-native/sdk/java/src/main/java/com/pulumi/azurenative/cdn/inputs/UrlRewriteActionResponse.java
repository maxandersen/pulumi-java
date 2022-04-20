// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.cdn.inputs;

import com.pulumi.azurenative.cdn.inputs.UrlRewriteActionParametersResponse;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * Defines the url rewrite action for the delivery rule.
 * 
 */
public final class UrlRewriteActionResponse extends com.pulumi.resources.InvokeArgs {

    public static final UrlRewriteActionResponse Empty = new UrlRewriteActionResponse();

    /**
     * The name of the action for the delivery rule.
     * Expected value is &#39;UrlRewrite&#39;.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    /**
     * Defines the parameters for the action.
     * 
     */
    @Import(name="parameters", required=true)
      private final UrlRewriteActionParametersResponse parameters;

    public UrlRewriteActionParametersResponse parameters() {
        return this.parameters;
    }

    public UrlRewriteActionResponse(
        String name,
        UrlRewriteActionParametersResponse parameters) {
        this.name = Codegen.stringProp("name").arg(name).require();
        this.parameters = Objects.requireNonNull(parameters, "expected parameter 'parameters' to be non-null");
    }

    private UrlRewriteActionResponse() {
        this.name = null;
        this.parameters = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UrlRewriteActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private UrlRewriteActionParametersResponse parameters;

        public Builder() {
    	      // Empty
        }

        public Builder(UrlRewriteActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
        }

        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder parameters(UrlRewriteActionParametersResponse parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }        public UrlRewriteActionResponse build() {
            return new UrlRewriteActionResponse(name, parameters);
        }
    }
}
