// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.devices.outputs;

import com.pulumi.azurenative.devices.outputs.CertificatePropertiesResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetCertificateResult {
    /**
     * The entity tag.
     * 
     */
    private final String etag;
    /**
     * The resource identifier.
     * 
     */
    private final String id;
    /**
     * The name of the certificate.
     * 
     */
    private final String name;
    /**
     * The description of an X509 CA Certificate.
     * 
     */
    private final CertificatePropertiesResponse properties;
    /**
     * The resource type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetCertificateResult(
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("properties") CertificatePropertiesResponse properties,
        @CustomType.Parameter("type") String type) {
        this.etag = etag;
        this.id = id;
        this.name = name;
        this.properties = properties;
        this.type = type;
    }

    /**
     * The entity tag.
     * 
    */
    public String etag() {
        return this.etag;
    }
    /**
     * The resource identifier.
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * The name of the certificate.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * The description of an X509 CA Certificate.
     * 
    */
    public CertificatePropertiesResponse properties() {
        return this.properties;
    }
    /**
     * The resource type.
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCertificateResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String etag;
        private String id;
        private String name;
        private CertificatePropertiesResponse properties;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCertificateResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.properties = defaults.properties;
    	      this.type = defaults.type;
        }

        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder properties(CertificatePropertiesResponse properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetCertificateResult build() {
            return new GetCertificateResult(etag, id, name, properties, type);
        }
    }
}
