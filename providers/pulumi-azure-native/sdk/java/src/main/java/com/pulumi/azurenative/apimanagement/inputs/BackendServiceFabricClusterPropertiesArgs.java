// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement.inputs;

import com.pulumi.azurenative.apimanagement.inputs.X509CertificateNameArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties of the Service Fabric Type Backend.
 * 
 */
public final class BackendServiceFabricClusterPropertiesArgs extends com.pulumi.resources.ResourceArgs {

    public static final BackendServiceFabricClusterPropertiesArgs Empty = new BackendServiceFabricClusterPropertiesArgs();

    /**
     * The client certificate id for the management endpoint.
     * 
     */
    @Import(name="clientCertificateId")
    private @Nullable Output<String> clientCertificateId;

    public Optional<Output<String>> clientCertificateId() {
        return Optional.ofNullable(this.clientCertificateId);
    }

    /**
     * The client certificate thumbprint for the management endpoint. Will be ignored if certificatesIds are provided
     * 
     */
    @Import(name="clientCertificatethumbprint")
    private @Nullable Output<String> clientCertificatethumbprint;

    public Optional<Output<String>> clientCertificatethumbprint() {
        return Optional.ofNullable(this.clientCertificatethumbprint);
    }

    /**
     * The cluster management endpoint.
     * 
     */
    @Import(name="managementEndpoints", required=true)
    private Output<List<String>> managementEndpoints;

    public Output<List<String>> managementEndpoints() {
        return this.managementEndpoints;
    }

    /**
     * Maximum number of retries while attempting resolve the partition.
     * 
     */
    @Import(name="maxPartitionResolutionRetries")
    private @Nullable Output<Integer> maxPartitionResolutionRetries;

    public Optional<Output<Integer>> maxPartitionResolutionRetries() {
        return Optional.ofNullable(this.maxPartitionResolutionRetries);
    }

    /**
     * Thumbprints of certificates cluster management service uses for tls communication
     * 
     */
    @Import(name="serverCertificateThumbprints")
    private @Nullable Output<List<String>> serverCertificateThumbprints;

    public Optional<Output<List<String>>> serverCertificateThumbprints() {
        return Optional.ofNullable(this.serverCertificateThumbprints);
    }

    /**
     * Server X509 Certificate Names Collection
     * 
     */
    @Import(name="serverX509Names")
    private @Nullable Output<List<X509CertificateNameArgs>> serverX509Names;

    public Optional<Output<List<X509CertificateNameArgs>>> serverX509Names() {
        return Optional.ofNullable(this.serverX509Names);
    }

    private BackendServiceFabricClusterPropertiesArgs() {}

    private BackendServiceFabricClusterPropertiesArgs(BackendServiceFabricClusterPropertiesArgs $) {
        this.clientCertificateId = $.clientCertificateId;
        this.clientCertificatethumbprint = $.clientCertificatethumbprint;
        this.managementEndpoints = $.managementEndpoints;
        this.maxPartitionResolutionRetries = $.maxPartitionResolutionRetries;
        this.serverCertificateThumbprints = $.serverCertificateThumbprints;
        this.serverX509Names = $.serverX509Names;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BackendServiceFabricClusterPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BackendServiceFabricClusterPropertiesArgs $;

        public Builder() {
            $ = new BackendServiceFabricClusterPropertiesArgs();
        }

        public Builder(BackendServiceFabricClusterPropertiesArgs defaults) {
            $ = new BackendServiceFabricClusterPropertiesArgs(Objects.requireNonNull(defaults));
        }

        public Builder clientCertificateId(@Nullable Output<String> clientCertificateId) {
            $.clientCertificateId = clientCertificateId;
            return this;
        }

        public Builder clientCertificateId(String clientCertificateId) {
            return clientCertificateId(Output.of(clientCertificateId));
        }

        public Builder clientCertificatethumbprint(@Nullable Output<String> clientCertificatethumbprint) {
            $.clientCertificatethumbprint = clientCertificatethumbprint;
            return this;
        }

        public Builder clientCertificatethumbprint(String clientCertificatethumbprint) {
            return clientCertificatethumbprint(Output.of(clientCertificatethumbprint));
        }

        public Builder managementEndpoints(Output<List<String>> managementEndpoints) {
            $.managementEndpoints = managementEndpoints;
            return this;
        }

        public Builder managementEndpoints(List<String> managementEndpoints) {
            return managementEndpoints(Output.of(managementEndpoints));
        }

        public Builder managementEndpoints(String... managementEndpoints) {
            return managementEndpoints(List.of(managementEndpoints));
        }

        public Builder maxPartitionResolutionRetries(@Nullable Output<Integer> maxPartitionResolutionRetries) {
            $.maxPartitionResolutionRetries = maxPartitionResolutionRetries;
            return this;
        }

        public Builder maxPartitionResolutionRetries(Integer maxPartitionResolutionRetries) {
            return maxPartitionResolutionRetries(Output.of(maxPartitionResolutionRetries));
        }

        public Builder serverCertificateThumbprints(@Nullable Output<List<String>> serverCertificateThumbprints) {
            $.serverCertificateThumbprints = serverCertificateThumbprints;
            return this;
        }

        public Builder serverCertificateThumbprints(List<String> serverCertificateThumbprints) {
            return serverCertificateThumbprints(Output.of(serverCertificateThumbprints));
        }

        public Builder serverCertificateThumbprints(String... serverCertificateThumbprints) {
            return serverCertificateThumbprints(List.of(serverCertificateThumbprints));
        }

        public Builder serverX509Names(@Nullable Output<List<X509CertificateNameArgs>> serverX509Names) {
            $.serverX509Names = serverX509Names;
            return this;
        }

        public Builder serverX509Names(List<X509CertificateNameArgs> serverX509Names) {
            return serverX509Names(Output.of(serverX509Names));
        }

        public Builder serverX509Names(X509CertificateNameArgs... serverX509Names) {
            return serverX509Names(List.of(serverX509Names));
        }

        public BackendServiceFabricClusterPropertiesArgs build() {
            $.managementEndpoints = Objects.requireNonNull($.managementEndpoints, "expected parameter 'managementEndpoints' to be non-null");
            return $;
        }
    }

}
