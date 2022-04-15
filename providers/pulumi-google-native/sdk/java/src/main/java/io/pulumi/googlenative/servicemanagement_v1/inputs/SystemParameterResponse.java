// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.servicemanagement_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Define a parameter's name and location. The parameter may be passed as either an HTTP header or a URL query parameter, and if both are passed the behavior is implementation-dependent.
 * 
 */
public final class SystemParameterResponse extends io.pulumi.resources.InvokeArgs {

    public static final SystemParameterResponse Empty = new SystemParameterResponse();

    /**
     * Define the HTTP header name to use for the parameter. It is case insensitive.
     * 
     */
    @Import(name="httpHeader", required=true)
      private final String httpHeader;

    public String httpHeader() {
        return this.httpHeader;
    }

    /**
     * Define the name of the parameter, such as "api_key" . It is case sensitive.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    /**
     * Define the URL query parameter name to use for the parameter. It is case sensitive.
     * 
     */
    @Import(name="urlQueryParameter", required=true)
      private final String urlQueryParameter;

    public String urlQueryParameter() {
        return this.urlQueryParameter;
    }

    public SystemParameterResponse(
        String httpHeader,
        String name,
        String urlQueryParameter) {
        this.httpHeader = Objects.requireNonNull(httpHeader, "expected parameter 'httpHeader' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.urlQueryParameter = Objects.requireNonNull(urlQueryParameter, "expected parameter 'urlQueryParameter' to be non-null");
    }

    private SystemParameterResponse() {
        this.httpHeader = null;
        this.name = null;
        this.urlQueryParameter = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SystemParameterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String httpHeader;
        private String name;
        private String urlQueryParameter;

        public Builder() {
    	      // Empty
        }

        public Builder(SystemParameterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.httpHeader = defaults.httpHeader;
    	      this.name = defaults.name;
    	      this.urlQueryParameter = defaults.urlQueryParameter;
        }

        public Builder httpHeader(String httpHeader) {
            this.httpHeader = Objects.requireNonNull(httpHeader);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder urlQueryParameter(String urlQueryParameter) {
            this.urlQueryParameter = Objects.requireNonNull(urlQueryParameter);
            return this;
        }        public SystemParameterResponse build() {
            return new SystemParameterResponse(httpHeader, name, urlQueryParameter);
        }
    }
}
