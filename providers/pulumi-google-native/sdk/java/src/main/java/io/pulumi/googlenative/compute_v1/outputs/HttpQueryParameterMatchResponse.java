// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class HttpQueryParameterMatchResponse {
    /**
     * The queryParameterMatch matches if the value of the parameter exactly matches the contents of exactMatch. Only one of presentMatch, exactMatch, or regexMatch must be set.
     * 
     */
    private final String exactMatch;
    /**
     * The name of the query parameter to match. The query parameter must exist in the request, in the absence of which the request match fails.
     * 
     */
    private final String name;
    /**
     * Specifies that the queryParameterMatch matches if the request contains the query parameter, irrespective of whether the parameter has a value or not. Only one of presentMatch, exactMatch, or regexMatch must be set.
     * 
     */
    private final Boolean presentMatch;
    /**
     * The queryParameterMatch matches if the value of the parameter matches the regular expression specified by regexMatch. For more information about regular expression syntax, see Syntax. Only one of presentMatch, exactMatch, or regexMatch must be set. regexMatch only applies when the loadBalancingScheme is set to INTERNAL_SELF_MANAGED.
     * 
     */
    private final String regexMatch;

    @CustomType.Constructor
    private HttpQueryParameterMatchResponse(
        @CustomType.Parameter("exactMatch") String exactMatch,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("presentMatch") Boolean presentMatch,
        @CustomType.Parameter("regexMatch") String regexMatch) {
        this.exactMatch = exactMatch;
        this.name = name;
        this.presentMatch = presentMatch;
        this.regexMatch = regexMatch;
    }

    /**
     * The queryParameterMatch matches if the value of the parameter exactly matches the contents of exactMatch. Only one of presentMatch, exactMatch, or regexMatch must be set.
     * 
    */
    public String exactMatch() {
        return this.exactMatch;
    }
    /**
     * The name of the query parameter to match. The query parameter must exist in the request, in the absence of which the request match fails.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Specifies that the queryParameterMatch matches if the request contains the query parameter, irrespective of whether the parameter has a value or not. Only one of presentMatch, exactMatch, or regexMatch must be set.
     * 
    */
    public Boolean presentMatch() {
        return this.presentMatch;
    }
    /**
     * The queryParameterMatch matches if the value of the parameter matches the regular expression specified by regexMatch. For more information about regular expression syntax, see Syntax. Only one of presentMatch, exactMatch, or regexMatch must be set. regexMatch only applies when the loadBalancingScheme is set to INTERNAL_SELF_MANAGED.
     * 
    */
    public String regexMatch() {
        return this.regexMatch;
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
