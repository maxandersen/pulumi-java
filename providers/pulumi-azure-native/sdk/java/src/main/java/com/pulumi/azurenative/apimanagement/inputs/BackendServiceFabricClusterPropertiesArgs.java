// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement.inputs;

import com.pulumi.azurenative.apimanagement.inputs.X509CertificateNameArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.resources.ResourceArgs;
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
public final class BackendServiceFabricClusterPropertiesArgs extends ResourceArgs {

    public static final BackendServiceFabricClusterPropertiesArgs Empty = new BackendServiceFabricClusterPropertiesArgs();

    /**
     * The client certificate id for the management endpoint.
     * 
     */
    @Import(name="clientCertificateId")
    private @Nullable Output<String> clientCertificateId;

    /**
     * @return The client certificate id for the management endpoint.
     * 
     */
    public Optional<Output<String>> clientCertificateId() {
        return Optional.ofNullable(this.clientCertificateId);
    }

    /**
     * The client certificate thumbprint for the management endpoint. Will be ignored if certificatesIds are provided
     * 
     */
    @Import(name="clientCertificatethumbprint")
    private @Nullable Output<String> clientCertificatethumbprint;

    /**
     * @return The client certificate thumbprint for the management endpoint. Will be ignored if certificatesIds are provided
     * 
     */
    public Optional<Output<String>> clientCertificatethumbprint() {
        return Optional.ofNullable(this.clientCertificatethumbprint);
    }

    /**
     * The cluster management endpoint.
     * 
     */
    @Import(name="managementEndpoints", required=true)
    private Output<List<String>> managementEndpoints;

    /**
     * @return The cluster management endpoint.
     * 
     */
    public Output<List<String>> managementEndpoints() {
        return this.managementEndpoints;
    }

    /**
     * Maximum number of retries while attempting resolve the partition.
     * 
     */
    @Import(name="maxPartitionResolutionRetries")
    private @Nullable Output<Integer> maxPartitionResolutionRetries;

    /**
     * @return Maximum number of retries while attempting resolve the partition.
     * 
     */
    public Optional<Output<Integer>> maxPartitionResolutionRetries() {
        return Optional.ofNullable(this.maxPartitionResolutionRetries);
    }

    /**
     * Thumbprints of certificates cluster management service uses for tls communication
     * 
     */
    @Import(name="serverCertificateThumbprints")
    private @Nullable Output<List<String>> serverCertificateThumbprints;

    /**
     * @return Thumbprints of certificates cluster management service uses for tls communication
     * 
     */
    public Optional<Output<List<String>>> serverCertificateThumbprints() {
        return Optional.ofNullable(this.serverCertificateThumbprints);
    }

    /**
     * Server X509 Certificate Names Collection
     * 
     */
    @Import(name="serverX509Names")
    private @Nullable Output<List<X509CertificateNameArgs>> serverX509Names;

    /**
     * @return Server X509 Certificate Names Collection
     * 
     */
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

        /**
         * @param clientCertificateId The client certificate id for the management endpoint.
         * 
         * @return builder
         * 
         */
        public Builder clientCertificateId(@Nullable Output<String> clientCertificateId) {
            $.clientCertificateId = clientCertificateId;
            return this;
        }

        /**
         * @param clientCertificateId The client certificate id for the management endpoint.
         * 
         * @return builder
         * 
         */
        public Builder clientCertificateId(String clientCertificateId) {
            return clientCertificateId(Output.of(clientCertificateId));
        }

        /**
         * @param clientCertificatethumbprint The client certificate thumbprint for the management endpoint. Will be ignored if certificatesIds are provided
         * 
         * @return builder
         * 
         */
        public Builder clientCertificatethumbprint(@Nullable Output<String> clientCertificatethumbprint) {
            $.clientCertificatethumbprint = clientCertificatethumbprint;
            return this;
        }

        /**
         * @param clientCertificatethumbprint The client certificate thumbprint for the management endpoint. Will be ignored if certificatesIds are provided
         * 
         * @return builder
         * 
         */
        public Builder clientCertificatethumbprint(String clientCertificatethumbprint) {
            return clientCertificatethumbprint(Output.of(clientCertificatethumbprint));
        }

        /**
         * @param managementEndpoints The cluster management endpoint.
         * 
         * @return builder
         * 
         */
        public Builder managementEndpoints(Output<List<String>> managementEndpoints) {
            $.managementEndpoints = managementEndpoints;
            return this;
        }

        /**
         * @param managementEndpoints The cluster management endpoint.
         * 
         * @return builder
         * 
         */
        public Builder managementEndpoints(List<String> managementEndpoints) {
            return managementEndpoints(Output.of(managementEndpoints));
        }

        /**
         * @param managementEndpoints The cluster management endpoint.
         * 
         * @return builder
         * 
         */
        public Builder managementEndpoints(String... managementEndpoints) {
            return managementEndpoints(List.of(managementEndpoints));
        }

        /**
         * @param maxPartitionResolutionRetries Maximum number of retries while attempting resolve the partition.
         * 
         * @return builder
         * 
         */
        public Builder maxPartitionResolutionRetries(@Nullable Output<Integer> maxPartitionResolutionRetries) {
            $.maxPartitionResolutionRetries = maxPartitionResolutionRetries;
            return this;
        }

        /**
         * @param maxPartitionResolutionRetries Maximum number of retries while attempting resolve the partition.
         * 
         * @return builder
         * 
         */
        public Builder maxPartitionResolutionRetries(Integer maxPartitionResolutionRetries) {
            return maxPartitionResolutionRetries(Output.of(maxPartitionResolutionRetries));
        }

        /**
         * @param serverCertificateThumbprints Thumbprints of certificates cluster management service uses for tls communication
         * 
         * @return builder
         * 
         */
        public Builder serverCertificateThumbprints(@Nullable Output<List<String>> serverCertificateThumbprints) {
            $.serverCertificateThumbprints = serverCertificateThumbprints;
            return this;
        }

        /**
         * @param serverCertificateThumbprints Thumbprints of certificates cluster management service uses for tls communication
         * 
         * @return builder
         * 
         */
        public Builder serverCertificateThumbprints(List<String> serverCertificateThumbprints) {
            return serverCertificateThumbprints(Output.of(serverCertificateThumbprints));
        }

        /**
         * @param serverCertificateThumbprints Thumbprints of certificates cluster management service uses for tls communication
         * 
         * @return builder
         * 
         */
        public Builder serverCertificateThumbprints(String... serverCertificateThumbprints) {
            return serverCertificateThumbprints(List.of(serverCertificateThumbprints));
        }

        /**
         * @param serverX509Names Server X509 Certificate Names Collection
         * 
         * @return builder
         * 
         */
        public Builder serverX509Names(@Nullable Output<List<X509CertificateNameArgs>> serverX509Names) {
            $.serverX509Names = serverX509Names;
            return this;
        }

        /**
         * @param serverX509Names Server X509 Certificate Names Collection
         * 
         * @return builder
         * 
         */
        public Builder serverX509Names(List<X509CertificateNameArgs> serverX509Names) {
            return serverX509Names(Output.of(serverX509Names));
        }

        /**
         * @param serverX509Names Server X509 Certificate Names Collection
         * 
         * @return builder
         * 
         */
        public Builder serverX509Names(X509CertificateNameArgs... serverX509Names) {
            return serverX509Names(List.of(serverX509Names));
        }

        public BackendServiceFabricClusterPropertiesArgs build() {
            $.managementEndpoints = Objects.requireNonNull($.managementEndpoints, "expected parameter 'managementEndpoints' to be non-null");
            return $;
        }
    }

}
