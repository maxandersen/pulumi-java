// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicefabricmesh.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Path to match for routing.
 * 
 */
public final class HttpRouteMatchPathResponse extends com.pulumi.resources.InvokeArgs {

    public static final HttpRouteMatchPathResponse Empty = new HttpRouteMatchPathResponse();

    /**
     * replacement string for matched part of the Uri.
     * 
     */
    @Import(name="rewrite")
      private final @Nullable String rewrite;

    public Optional<String> rewrite() {
        return this.rewrite == null ? Optional.empty() : Optional.ofNullable(this.rewrite);
    }

    /**
     * how to match value in the Uri
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    /**
     * Uri path to match for request.
     * 
     */
    @Import(name="value", required=true)
      private final String value;

    public String value() {
        return this.value;
    }

    public HttpRouteMatchPathResponse(
        @Nullable String rewrite,
        String type,
        String value) {
        this.rewrite = rewrite;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private HttpRouteMatchPathResponse() {
        this.rewrite = null;
        this.type = null;
        this.value = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpRouteMatchPathResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String rewrite;
        private String type;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpRouteMatchPathResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rewrite = defaults.rewrite;
    	      this.type = defaults.type;
    	      this.value = defaults.value;
        }

        public Builder rewrite(@Nullable String rewrite) {
            this.rewrite = rewrite;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public HttpRouteMatchPathResponse build() {
            return new HttpRouteMatchPathResponse(rewrite, type, value);
        }
    }
}
