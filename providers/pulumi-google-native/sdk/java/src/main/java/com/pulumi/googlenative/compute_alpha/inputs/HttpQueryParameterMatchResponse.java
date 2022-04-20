// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * HttpRouteRuleMatch criteria for a request&#39;s query parameter.
 * 
 */
public final class HttpQueryParameterMatchResponse extends com.pulumi.resources.InvokeArgs {

    public static final HttpQueryParameterMatchResponse Empty = new HttpQueryParameterMatchResponse();

    /**
     * The queryParameterMatch matches if the value of the parameter exactly matches the contents of exactMatch. Only one of presentMatch, exactMatch, or regexMatch must be set.
     * 
     */
    @Import(name="exactMatch", required=true)
      private final String exactMatch;

    public String exactMatch() {
        return this.exactMatch;
    }

    /**
     * The name of the query parameter to match. The query parameter must exist in the request, in the absence of which the request match fails.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    /**
     * Specifies that the queryParameterMatch matches if the request contains the query parameter, irrespective of whether the parameter has a value or not. Only one of presentMatch, exactMatch, or regexMatch must be set.
     * 
     */
    @Import(name="presentMatch", required=true)
      private final Boolean presentMatch;

    public Boolean presentMatch() {
        return this.presentMatch;
    }

    /**
     * The queryParameterMatch matches if the value of the parameter matches the regular expression specified by regexMatch. For more information about regular expression syntax, see Syntax. Only one of presentMatch, exactMatch, or regexMatch must be set. regexMatch only applies when the loadBalancingScheme is set to INTERNAL_SELF_MANAGED.
     * 
     */
    @Import(name="regexMatch", required=true)
      private final String regexMatch;

    public String regexMatch() {
        return this.regexMatch;
    }

    public HttpQueryParameterMatchResponse(
        String exactMatch,
        String name,
        Boolean presentMatch,
        String regexMatch) {
        this.exactMatch = Objects.requireNonNull(exactMatch, "expected parameter 'exactMatch' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.presentMatch = Objects.requireNonNull(presentMatch, "expected parameter 'presentMatch' to be non-null");
        this.regexMatch = Objects.requireNonNull(regexMatch, "expected parameter 'regexMatch' to be non-null");
    }

    private HttpQueryParameterMatchResponse() {
        this.exactMatch = null;
        this.name = null;
        this.presentMatch = null;
        this.regexMatch = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpQueryParameterMatchResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String exactMatch;
        private String name;
        private Boolean presentMatch;
        private String regexMatch;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpQueryParameterMatchResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exactMatch = defaults.exactMatch;
    	      this.name = defaults.name;
    	      this.presentMatch = defaults.presentMatch;
    	      this.regexMatch = defaults.regexMatch;
        }

        public Builder exactMatch(String exactMatch) {
            this.exactMatch = Objects.requireNonNull(exactMatch);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder presentMatch(Boolean presentMatch) {
            this.presentMatch = Objects.requireNonNull(presentMatch);
            return this;
        }
        public Builder regexMatch(String regexMatch) {
            this.regexMatch = Objects.requireNonNull(regexMatch);
            return this;
        }        public HttpQueryParameterMatchResponse build() {
            return new HttpQueryParameterMatchResponse(exactMatch, name, presentMatch, regexMatch);
        }
    }
}
