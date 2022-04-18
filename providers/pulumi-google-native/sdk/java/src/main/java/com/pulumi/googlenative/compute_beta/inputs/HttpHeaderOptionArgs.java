// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specification determining how headers are added to requests or responses.
 * 
 */
public final class HttpHeaderOptionArgs extends com.pulumi.resources.ResourceArgs {

    public static final HttpHeaderOptionArgs Empty = new HttpHeaderOptionArgs();

    /**
     * The name of the header.
     * 
     */
    @Import(name="headerName")
      private final @Nullable Output<String> headerName;

    public Output<String> headerName() {
        return this.headerName == null ? Codegen.empty() : this.headerName;
    }

    /**
     * The value of the header to add.
     * 
     */
    @Import(name="headerValue")
      private final @Nullable Output<String> headerValue;

    public Output<String> headerValue() {
        return this.headerValue == null ? Codegen.empty() : this.headerValue;
    }

    /**
     * If false, headerValue is appended to any values that already exist for the header. If true, headerValue is set for the header, discarding any values that were set for that header. The default value is false.
     * 
     */
    @Import(name="replace")
      private final @Nullable Output<Boolean> replace;

    public Output<Boolean> replace() {
        return this.replace == null ? Codegen.empty() : this.replace;
    }

    public HttpHeaderOptionArgs(
        @Nullable Output<String> headerName,
        @Nullable Output<String> headerValue,
        @Nullable Output<Boolean> replace) {
        this.headerName = headerName;
        this.headerValue = headerValue;
        this.replace = replace;
    }

    private HttpHeaderOptionArgs() {
        this.headerName = Codegen.empty();
        this.headerValue = Codegen.empty();
        this.replace = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpHeaderOptionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> headerName;
        private @Nullable Output<String> headerValue;
        private @Nullable Output<Boolean> replace;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpHeaderOptionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.headerName = defaults.headerName;
    	      this.headerValue = defaults.headerValue;
    	      this.replace = defaults.replace;
        }

        public Builder headerName(@Nullable Output<String> headerName) {
            this.headerName = headerName;
            return this;
        }
        public Builder headerName(@Nullable String headerName) {
            this.headerName = Codegen.ofNullable(headerName);
            return this;
        }
        public Builder headerValue(@Nullable Output<String> headerValue) {
            this.headerValue = headerValue;
            return this;
        }
        public Builder headerValue(@Nullable String headerValue) {
            this.headerValue = Codegen.ofNullable(headerValue);
            return this;
        }
        public Builder replace(@Nullable Output<Boolean> replace) {
            this.replace = replace;
            return this;
        }
        public Builder replace(@Nullable Boolean replace) {
            this.replace = Codegen.ofNullable(replace);
            return this;
        }        public HttpHeaderOptionArgs build() {
            return new HttpHeaderOptionArgs(headerName, headerValue, replace);
        }
    }
}
