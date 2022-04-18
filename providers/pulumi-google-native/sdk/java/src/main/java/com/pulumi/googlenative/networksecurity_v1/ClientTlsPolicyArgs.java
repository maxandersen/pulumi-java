// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.networksecurity_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.networksecurity_v1.inputs.GoogleCloudNetworksecurityV1CertificateProviderArgs;
import com.pulumi.googlenative.networksecurity_v1.inputs.ValidationCAArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClientTlsPolicyArgs extends com.pulumi.resources.ResourceArgs {

    public static final ClientTlsPolicyArgs Empty = new ClientTlsPolicyArgs();

    /**
     * Optional. Defines a mechanism to provision client identity (public and private keys) for peer to peer authentication. The presence of this dictates mTLS.
     * 
     */
    @Import(name="clientCertificate")
      private final @Nullable Output<GoogleCloudNetworksecurityV1CertificateProviderArgs> clientCertificate;

    public Output<GoogleCloudNetworksecurityV1CertificateProviderArgs> clientCertificate() {
        return this.clientCertificate == null ? Codegen.empty() : this.clientCertificate;
    }

    @Import(name="clientTlsPolicyId", required=true)
      private final Output<String> clientTlsPolicyId;

    public Output<String> clientTlsPolicyId() {
        return this.clientTlsPolicyId;
    }

    /**
     * Optional. Free-text description of the resource.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Optional. Set of label tags associated with the resource.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> labels() {
        return this.labels == null ? Codegen.empty() : this.labels;
    }

    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * Name of the ClientTlsPolicy resource. It matches the pattern `projects/*{@literal /}locations/{location}/clientTlsPolicies/{client_tls_policy}`
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * Optional. Defines the mechanism to obtain the Certificate Authority certificate to validate the server certificate. If empty, client does not validate the server certificate.
     * 
     */
    @Import(name="serverValidationCa")
      private final @Nullable Output<List<ValidationCAArgs>> serverValidationCa;

    public Output<List<ValidationCAArgs>> serverValidationCa() {
        return this.serverValidationCa == null ? Codegen.empty() : this.serverValidationCa;
    }

    /**
     * Optional. Server Name Indication string to present to the server during TLS handshake. E.g: "secure.example.com".
     * 
     */
    @Import(name="sni")
      private final @Nullable Output<String> sni;

    public Output<String> sni() {
        return this.sni == null ? Codegen.empty() : this.sni;
    }

    public ClientTlsPolicyArgs(
        @Nullable Output<GoogleCloudNetworksecurityV1CertificateProviderArgs> clientCertificate,
        Output<String> clientTlsPolicyId,
        @Nullable Output<String> description,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<String> location,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<List<ValidationCAArgs>> serverValidationCa,
        @Nullable Output<String> sni) {
        this.clientCertificate = clientCertificate;
        this.clientTlsPolicyId = Objects.requireNonNull(clientTlsPolicyId, "expected parameter 'clientTlsPolicyId' to be non-null");
        this.description = description;
        this.labels = labels;
        this.location = location;
        this.name = name;
        this.project = project;
        this.serverValidationCa = serverValidationCa;
        this.sni = sni;
    }

    private ClientTlsPolicyArgs() {
        this.clientCertificate = Codegen.empty();
        this.clientTlsPolicyId = Codegen.empty();
        this.description = Codegen.empty();
        this.labels = Codegen.empty();
        this.location = Codegen.empty();
        this.name = Codegen.empty();
        this.project = Codegen.empty();
        this.serverValidationCa = Codegen.empty();
        this.sni = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClientTlsPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<GoogleCloudNetworksecurityV1CertificateProviderArgs> clientCertificate;
        private Output<String> clientTlsPolicyId;
        private @Nullable Output<String> description;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<String> location;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<List<ValidationCAArgs>> serverValidationCa;
        private @Nullable Output<String> sni;

        public Builder() {
    	      // Empty
        }

        public Builder(ClientTlsPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientCertificate = defaults.clientCertificate;
    	      this.clientTlsPolicyId = defaults.clientTlsPolicyId;
    	      this.description = defaults.description;
    	      this.labels = defaults.labels;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.serverValidationCa = defaults.serverValidationCa;
    	      this.sni = defaults.sni;
        }

        public Builder clientCertificate(@Nullable Output<GoogleCloudNetworksecurityV1CertificateProviderArgs> clientCertificate) {
            this.clientCertificate = clientCertificate;
            return this;
        }
        public Builder clientCertificate(@Nullable GoogleCloudNetworksecurityV1CertificateProviderArgs clientCertificate) {
            this.clientCertificate = Codegen.ofNullable(clientCertificate);
            return this;
        }
        public Builder clientTlsPolicyId(Output<String> clientTlsPolicyId) {
            this.clientTlsPolicyId = Objects.requireNonNull(clientTlsPolicyId);
            return this;
        }
        public Builder clientTlsPolicyId(String clientTlsPolicyId) {
            this.clientTlsPolicyId = Output.of(Objects.requireNonNull(clientTlsPolicyId));
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Codegen.ofNullable(labels);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder serverValidationCa(@Nullable Output<List<ValidationCAArgs>> serverValidationCa) {
            this.serverValidationCa = serverValidationCa;
            return this;
        }
        public Builder serverValidationCa(@Nullable List<ValidationCAArgs> serverValidationCa) {
            this.serverValidationCa = Codegen.ofNullable(serverValidationCa);
            return this;
        }
        public Builder serverValidationCa(ValidationCAArgs... serverValidationCa) {
            return serverValidationCa(List.of(serverValidationCa));
        }
        public Builder sni(@Nullable Output<String> sni) {
            this.sni = sni;
            return this;
        }
        public Builder sni(@Nullable String sni) {
            this.sni = Codegen.ofNullable(sni);
            return this;
        }        public ClientTlsPolicyArgs build() {
            return new ClientTlsPolicyArgs(clientCertificate, clientTlsPolicyId, description, labels, location, name, project, serverValidationCa, sni);
        }
    }
}
