// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networksecurity_v1beta1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.networksecurity_v1beta1.outputs.GoogleCloudNetworksecurityV1beta1CertificateProviderResponse;
import com.pulumi.googlenative.networksecurity_v1beta1.outputs.MTLSPolicyResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetServerTlsPolicyResult {
    /**
     *  Determines if server allows plaintext connections. If set to true, server allows plain text connections. By default, it is set to false. This setting is not exclusive of other encryption modes. For example, if `allow_open` and `mtls_policy` are set, server allows both plain text and mTLS connections. See documentation of other encryption modes to confirm compatibility.
     * 
     */
    private final Boolean allowOpen;
    /**
     * The timestamp when the resource was created.
     * 
     */
    private final String createTime;
    /**
     * Free-text description of the resource.
     * 
     */
    private final String description;
    /**
     * Set of label tags associated with the resource.
     * 
     */
    private final Map<String,String> labels;
    /**
     *  Defines a mechanism to provision peer validation certificates for peer to peer authentication (Mutual TLS - mTLS). If not specified, client certificate will not be requested. The connection is treated as TLS and not mTLS. If `allow_open` and `mtls_policy` are set, server allows both plain text and mTLS connections.
     * 
     */
    private final MTLSPolicyResponse mtlsPolicy;
    /**
     * Name of the ServerTlsPolicy resource. It matches the pattern `projects/*{@literal /}locations/{location}/serverTlsPolicies/{server_tls_policy}`
     * 
     */
    private final String name;
    /**
     *  Defines a mechanism to provision server identity (public and private keys). Cannot be combined with `allow_open` as a permissive mode that allows both plain text and TLS is not supported.
     * 
     */
    private final GoogleCloudNetworksecurityV1beta1CertificateProviderResponse serverCertificate;
    /**
     * The timestamp when the resource was updated.
     * 
     */
    private final String updateTime;

    @CustomType.Constructor
    private GetServerTlsPolicyResult(
        @CustomType.Parameter("allowOpen") Boolean allowOpen,
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("mtlsPolicy") MTLSPolicyResponse mtlsPolicy,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("serverCertificate") GoogleCloudNetworksecurityV1beta1CertificateProviderResponse serverCertificate,
        @CustomType.Parameter("updateTime") String updateTime) {
        this.allowOpen = allowOpen;
        this.createTime = createTime;
        this.description = description;
        this.labels = labels;
        this.mtlsPolicy = mtlsPolicy;
        this.name = name;
        this.serverCertificate = serverCertificate;
        this.updateTime = updateTime;
    }

    /**
     *  Determines if server allows plaintext connections. If set to true, server allows plain text connections. By default, it is set to false. This setting is not exclusive of other encryption modes. For example, if `allow_open` and `mtls_policy` are set, server allows both plain text and mTLS connections. See documentation of other encryption modes to confirm compatibility.
     * 
    */
    public Boolean allowOpen() {
        return this.allowOpen;
    }
    /**
     * The timestamp when the resource was created.
     * 
    */
    public String createTime() {
        return this.createTime;
    }
    /**
     * Free-text description of the resource.
     * 
    */
    public String description() {
        return this.description;
    }
    /**
     * Set of label tags associated with the resource.
     * 
    */
    public Map<String,String> labels() {
        return this.labels;
    }
    /**
     *  Defines a mechanism to provision peer validation certificates for peer to peer authentication (Mutual TLS - mTLS). If not specified, client certificate will not be requested. The connection is treated as TLS and not mTLS. If `allow_open` and `mtls_policy` are set, server allows both plain text and mTLS connections.
     * 
    */
    public MTLSPolicyResponse mtlsPolicy() {
        return this.mtlsPolicy;
    }
    /**
     * Name of the ServerTlsPolicy resource. It matches the pattern `projects/*{@literal /}locations/{location}/serverTlsPolicies/{server_tls_policy}`
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     *  Defines a mechanism to provision server identity (public and private keys). Cannot be combined with `allow_open` as a permissive mode that allows both plain text and TLS is not supported.
     * 
    */
    public GoogleCloudNetworksecurityV1beta1CertificateProviderResponse serverCertificate() {
        return this.serverCertificate;
    }
    /**
     * The timestamp when the resource was updated.
     * 
    */
    public String updateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServerTlsPolicyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean allowOpen;
        private String createTime;
        private String description;
        private Map<String,String> labels;
        private MTLSPolicyResponse mtlsPolicy;
        private String name;
        private GoogleCloudNetworksecurityV1beta1CertificateProviderResponse serverCertificate;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServerTlsPolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowOpen = defaults.allowOpen;
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.labels = defaults.labels;
    	      this.mtlsPolicy = defaults.mtlsPolicy;
    	      this.name = defaults.name;
    	      this.serverCertificate = defaults.serverCertificate;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder allowOpen(Boolean allowOpen) {
            this.allowOpen = Objects.requireNonNull(allowOpen);
            return this;
        }
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder mtlsPolicy(MTLSPolicyResponse mtlsPolicy) {
            this.mtlsPolicy = Objects.requireNonNull(mtlsPolicy);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder serverCertificate(GoogleCloudNetworksecurityV1beta1CertificateProviderResponse serverCertificate) {
            this.serverCertificate = Objects.requireNonNull(serverCertificate);
            return this;
        }
        public Builder updateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }        public GetServerTlsPolicyResult build() {
            return new GetServerTlsPolicyResult(allowOpen, createTime, description, labels, mtlsPolicy, name, serverCertificate, updateTime);
        }
    }
}
