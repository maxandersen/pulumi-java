// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.servicemanagement_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class JwtLocationResponse {
    /**
     * Specifies HTTP header name to extract JWT token.
     * 
     */
    private final String header;
    /**
     * Specifies URL query parameter name to extract JWT token.
     * 
     */
    private final String query;
    /**
     * The value prefix. The value format is &#34;value_prefix{token}&#34; Only applies to &#34;in&#34; header type. Must be empty for &#34;in&#34; query type. If not empty, the header value has to match (case sensitive) this prefix. If not matched, JWT will not be extracted. If matched, JWT will be extracted after the prefix is removed. For example, for &#34;Authorization: Bearer {JWT}&#34;, value_prefix=&#34;Bearer &#34; with a space at the end.
     * 
     */
    private final String valuePrefix;

    @CustomType.Constructor
    private JwtLocationResponse(
        @CustomType.Parameter("header") String header,
        @CustomType.Parameter("query") String query,
        @CustomType.Parameter("valuePrefix") String valuePrefix) {
        this.header = header;
        this.query = query;
        this.valuePrefix = valuePrefix;
    }

    /**
     * Specifies HTTP header name to extract JWT token.
     * 
    */
    public String header() {
        return this.header;
    }
    /**
     * Specifies URL query parameter name to extract JWT token.
     * 
    */
    public String query() {
        return this.query;
    }
    /**
     * The value prefix. The value format is &#34;value_prefix{token}&#34; Only applies to &#34;in&#34; header type. Must be empty for &#34;in&#34; query type. If not empty, the header value has to match (case sensitive) this prefix. If not matched, JWT will not be extracted. If matched, JWT will be extracted after the prefix is removed. For example, for &#34;Authorization: Bearer {JWT}&#34;, value_prefix=&#34;Bearer &#34; with a space at the end.
     * 
    */
    public String valuePrefix() {
        return this.valuePrefix;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JwtLocationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String header;
        private String query;
        private String valuePrefix;

        public Builder() {
    	      // Empty
        }

        public Builder(JwtLocationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.header = defaults.header;
    	      this.query = defaults.query;
    	      this.valuePrefix = defaults.valuePrefix;
        }

        public Builder header(String header) {
            this.header = Objects.requireNonNull(header);
            return this;
        }
        public Builder query(String query) {
            this.query = Objects.requireNonNull(query);
            return this;
        }
        public Builder valuePrefix(String valuePrefix) {
            this.valuePrefix = Objects.requireNonNull(valuePrefix);
            return this;
        }        public JwtLocationResponse build() {
            return new JwtLocationResponse(header, query, valuePrefix);
        }
    }
}
