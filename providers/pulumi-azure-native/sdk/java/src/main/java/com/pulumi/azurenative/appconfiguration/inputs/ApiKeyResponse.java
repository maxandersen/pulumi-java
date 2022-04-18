// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.appconfiguration.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * An API key used for authenticating with a configuration store endpoint.
 * 
 */
public final class ApiKeyResponse extends com.pulumi.resources.InvokeArgs {

    public static final ApiKeyResponse Empty = new ApiKeyResponse();

    /**
     * A connection string that can be used by supporting clients for authentication.
     * 
     */
    @Import(name="connectionString", required=true)
      private final String connectionString;

    public String connectionString() {
        return this.connectionString;
    }

    /**
     * The key ID.
     * 
     */
    @Import(name="id", required=true)
      private final String id;

    public String id() {
        return this.id;
    }

    /**
     * The last time any of the key's properties were modified.
     * 
     */
    @Import(name="lastModified", required=true)
      private final String lastModified;

    public String lastModified() {
        return this.lastModified;
    }

    /**
     * A name for the key describing its usage.
     * 
     */
    @Import(name="name", required=true)
      private final String name;

    public String name() {
        return this.name;
    }

    /**
     * Whether this key can only be used for read operations.
     * 
     */
    @Import(name="readOnly", required=true)
      private final Boolean readOnly;

    public Boolean readOnly() {
        return this.readOnly;
    }

    /**
     * The value of the key that is used for authentication purposes.
     * 
     */
    @Import(name="value", required=true)
      private final String value;

    public String value() {
        return this.value;
    }

    public ApiKeyResponse(
        String connectionString,
        String id,
        String lastModified,
        String name,
        Boolean readOnly,
        String value) {
        this.connectionString = Objects.requireNonNull(connectionString, "expected parameter 'connectionString' to be non-null");
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.lastModified = Objects.requireNonNull(lastModified, "expected parameter 'lastModified' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.readOnly = Objects.requireNonNull(readOnly, "expected parameter 'readOnly' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private ApiKeyResponse() {
        this.connectionString = null;
        this.id = null;
        this.lastModified = null;
        this.name = null;
        this.readOnly = null;
        this.value = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiKeyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String connectionString;
        private String id;
        private String lastModified;
        private String name;
        private Boolean readOnly;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiKeyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionString = defaults.connectionString;
    	      this.id = defaults.id;
    	      this.lastModified = defaults.lastModified;
    	      this.name = defaults.name;
    	      this.readOnly = defaults.readOnly;
    	      this.value = defaults.value;
        }

        public Builder connectionString(String connectionString) {
            this.connectionString = Objects.requireNonNull(connectionString);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder lastModified(String lastModified) {
            this.lastModified = Objects.requireNonNull(lastModified);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder readOnly(Boolean readOnly) {
            this.readOnly = Objects.requireNonNull(readOnly);
            return this;
        }
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public ApiKeyResponse build() {
            return new ApiKeyResponse(connectionString, id, lastModified, name, readOnly, value);
        }
    }
}
