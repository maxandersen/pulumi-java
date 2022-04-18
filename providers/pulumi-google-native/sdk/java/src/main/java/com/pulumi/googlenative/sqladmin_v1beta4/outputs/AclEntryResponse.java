// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.sqladmin_v1beta4.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class AclEntryResponse {
    /**
     * The time when this access control entry expires in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2012-11-15T16:19:00.094Z`.
     * 
     */
    private final String expirationTime;
    /**
     * This is always `sql#aclEntry`.
     * 
     */
    private final String kind;
    /**
     * Optional. A label to identify this entry.
     * 
     */
    private final String name;
    /**
     * The allowlisted value for the access control list.
     * 
     */
    private final String value;

    @CustomType.Constructor
    private AclEntryResponse(
        @CustomType.Parameter("expirationTime") String expirationTime,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("value") String value) {
        this.expirationTime = expirationTime;
        this.kind = kind;
        this.name = name;
        this.value = value;
    }

    /**
     * The time when this access control entry expires in [RFC 3339](https://tools.ietf.org/html/rfc3339) format, for example `2012-11-15T16:19:00.094Z`.
     * 
    */
    public String expirationTime() {
        return this.expirationTime;
    }
    /**
     * This is always `sql#aclEntry`.
     * 
    */
    public String kind() {
        return this.kind;
    }
    /**
     * Optional. A label to identify this entry.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * The allowlisted value for the access control list.
     * 
    */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AclEntryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String expirationTime;
        private String kind;
        private String name;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(AclEntryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expirationTime = defaults.expirationTime;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.value = defaults.value;
        }

        public Builder expirationTime(String expirationTime) {
            this.expirationTime = Objects.requireNonNull(expirationTime);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }        public AclEntryResponse build() {
            return new AclEntryResponse(expirationTime, kind, name, value);
        }
    }
}
