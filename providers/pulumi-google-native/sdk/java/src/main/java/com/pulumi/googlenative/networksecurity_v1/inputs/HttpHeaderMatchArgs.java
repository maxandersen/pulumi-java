// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networksecurity_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * Specification of HTTP header match atrributes.
 * 
 */
public final class HttpHeaderMatchArgs extends com.pulumi.resources.ResourceArgs {

    public static final HttpHeaderMatchArgs Empty = new HttpHeaderMatchArgs();

    /**
     * The name of the HTTP header to match. For matching against the HTTP request's authority, use a headerMatch with the header name ":authority". For matching a request's method, use the headerName ":method".
     * 
     */
    @Import(name="headerName", required=true)
      private final Output<String> headerName;

    public Output<String> headerName() {
        return this.headerName;
    }

    /**
     * The value of the header must match the regular expression specified in regexMatch. For regular expression grammar, please see: en.cppreference.com/w/cpp/regex/ecmascript For matching against a port specified in the HTTP request, use a headerMatch with headerName set to Host and a regular expression that satisfies the RFC2616 Host header's port specifier.
     * 
     */
    @Import(name="regexMatch", required=true)
      private final Output<String> regexMatch;

    public Output<String> regexMatch() {
        return this.regexMatch;
    }

    public HttpHeaderMatchArgs(
        Output<String> headerName,
        Output<String> regexMatch) {
        this.headerName = Objects.requireNonNull(headerName, "expected parameter 'headerName' to be non-null");
        this.regexMatch = Objects.requireNonNull(regexMatch, "expected parameter 'regexMatch' to be non-null");
    }

    private HttpHeaderMatchArgs() {
        this.headerName = Codegen.empty();
        this.regexMatch = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpHeaderMatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> headerName;
        private Output<String> regexMatch;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpHeaderMatchArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.headerName = defaults.headerName;
    	      this.regexMatch = defaults.regexMatch;
        }

        public Builder headerName(Output<String> headerName) {
            this.headerName = Objects.requireNonNull(headerName);
            return this;
        }
        public Builder headerName(String headerName) {
            this.headerName = Output.of(Objects.requireNonNull(headerName));
            return this;
        }
        public Builder regexMatch(Output<String> regexMatch) {
            this.regexMatch = Objects.requireNonNull(regexMatch);
            return this;
        }
        public Builder regexMatch(String regexMatch) {
            this.regexMatch = Output.of(Objects.requireNonNull(regexMatch));
            return this;
        }        public HttpHeaderMatchArgs build() {
            return new HttpHeaderMatchArgs(headerName, regexMatch);
        }
    }
}
