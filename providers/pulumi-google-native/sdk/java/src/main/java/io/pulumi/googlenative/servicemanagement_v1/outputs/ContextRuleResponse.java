// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ContextRuleResponse {
    /**
     * A list of full type names or extension IDs of extensions allowed in grpc side channel from client to backend.
     * 
     */
    private final List<String> allowedRequestExtensions;
    /**
     * A list of full type names or extension IDs of extensions allowed in grpc side channel from backend to client.
     * 
     */
    private final List<String> allowedResponseExtensions;
    /**
     * A list of full type names of provided contexts.
     * 
     */
    private final List<String> provided;
    /**
     * A list of full type names of requested contexts.
     * 
     */
    private final List<String> requested;
    /**
     * Selects the methods to which this rule applies. Refer to selector for syntax details.
     * 
     */
    private final String selector;

    @CustomType.Constructor
    private ContextRuleResponse(
        @CustomType.Parameter("allowedRequestExtensions") List<String> allowedRequestExtensions,
        @CustomType.Parameter("allowedResponseExtensions") List<String> allowedResponseExtensions,
        @CustomType.Parameter("provided") List<String> provided,
        @CustomType.Parameter("requested") List<String> requested,
        @CustomType.Parameter("selector") String selector) {
        this.allowedRequestExtensions = allowedRequestExtensions;
        this.allowedResponseExtensions = allowedResponseExtensions;
        this.provided = provided;
        this.requested = requested;
        this.selector = selector;
    }

    /**
     * A list of full type names or extension IDs of extensions allowed in grpc side channel from client to backend.
     * 
    */
    public List<String> allowedRequestExtensions() {
        return this.allowedRequestExtensions;
    }
    /**
     * A list of full type names or extension IDs of extensions allowed in grpc side channel from backend to client.
     * 
    */
    public List<String> allowedResponseExtensions() {
        return this.allowedResponseExtensions;
    }
    /**
     * A list of full type names of provided contexts.
     * 
    */
    public List<String> provided() {
        return this.provided;
    }
    /**
     * A list of full type names of requested contexts.
     * 
    */
    public List<String> requested() {
        return this.requested;
    }
    /**
     * Selects the methods to which this rule applies. Refer to selector for syntax details.
     * 
    */
    public String selector() {
        return this.selector;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContextRuleResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> allowedRequestExtensions;
        private List<String> allowedResponseExtensions;
        private List<String> provided;
        private List<String> requested;
        private String selector;

        public Builder() {
    	      // Empty
        }

        public Builder(ContextRuleResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedRequestExtensions = defaults.allowedRequestExtensions;
    	      this.allowedResponseExtensions = defaults.allowedResponseExtensions;
    	      this.provided = defaults.provided;
    	      this.requested = defaults.requested;
    	      this.selector = defaults.selector;
        }

        public Builder allowedRequestExtensions(List<String> allowedRequestExtensions) {
            this.allowedRequestExtensions = Objects.requireNonNull(allowedRequestExtensions);
            return this;
        }
        public Builder allowedRequestExtensions(String... allowedRequestExtensions) {
            return allowedRequestExtensions(List.of(allowedRequestExtensions));
        }
        public Builder allowedResponseExtensions(List<String> allowedResponseExtensions) {
            this.allowedResponseExtensions = Objects.requireNonNull(allowedResponseExtensions);
            return this;
        }
        public Builder allowedResponseExtensions(String... allowedResponseExtensions) {
            return allowedResponseExtensions(List.of(allowedResponseExtensions));
        }
        public Builder provided(List<String> provided) {
            this.provided = Objects.requireNonNull(provided);
            return this;
        }
        public Builder provided(String... provided) {
            return provided(List.of(provided));
        }
        public Builder requested(List<String> requested) {
            this.requested = Objects.requireNonNull(requested);
            return this;
        }
        public Builder requested(String... requested) {
            return requested(List.of(requested));
        }
        public Builder selector(String selector) {
            this.selector = Objects.requireNonNull(selector);
            return this;
        }        public ContextRuleResponse build() {
            return new ContextRuleResponse(allowedRequestExtensions, allowedResponseExtensions, provided, requested, selector);
        }
    }
}
