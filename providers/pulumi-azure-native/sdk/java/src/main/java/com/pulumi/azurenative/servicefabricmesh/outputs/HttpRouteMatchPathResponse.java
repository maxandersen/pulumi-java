// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.servicefabricmesh.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class HttpRouteMatchPathResponse {
    /**
     * @return replacement string for matched part of the Uri.
     * 
     */
    private final @Nullable String rewrite;
    /**
     * @return how to match value in the Uri
     * 
     */
    private final String type;
    /**
     * @return Uri path to match for request.
     * 
     */
    private final String value;

    @CustomType.Constructor
    private HttpRouteMatchPathResponse(
        @CustomType.Parameter("rewrite") @Nullable String rewrite,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("value") String value) {
        this.rewrite = rewrite;
        this.type = type;
        this.value = value;
    }

    /**
     * @return replacement string for matched part of the Uri.
     * 
     */
    public Optional<String> rewrite() {
        return Optional.ofNullable(this.rewrite);
    }
    /**
     * @return how to match value in the Uri
     * 
     */
    public String type() {
        return this.type;
    }
    /**
     * @return Uri path to match for request.
     * 
     */
    public String value() {
        return this.value;
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
