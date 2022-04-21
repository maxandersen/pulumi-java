// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataproc_v1beta2.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.dataproc_v1beta2.enums.GceClusterConfigPrivateIpv6GoogleAccess;
import com.pulumi.googlenative.dataproc_v1beta2.inputs.NodeGroupAffinityArgs;
import com.pulumi.googlenative.dataproc_v1beta2.inputs.ReservationAffinityArgs;
import com.pulumi.googlenative.dataproc_v1beta2.inputs.ShieldedInstanceConfigArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Common config settings for resources of Compute Engine cluster instances, applicable to all instances in the cluster.
 * 
 */
public final class GceClusterConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final GceClusterConfigArgs Empty = new GceClusterConfigArgs();

    /**
     * Optional. If true, all instances in the cluster will only have internal IP addresses. By default, clusters are not restricted to internal IP addresses, and will have ephemeral external IP addresses assigned to each instance. This internal_ip_only restriction can only be enabled for subnetwork enabled networks, and all off-cluster dependencies must be configured to be accessible without external IP addresses.
     * 
     */
    @Import(name="internalIpOnly")
    private @Nullable Output<Boolean> internalIpOnly;

    public Optional<Output<Boolean>> internalIpOnly() {
        return Optional.ofNullable(this.internalIpOnly);
    }

    /**
     * The Compute Engine metadata entries to add to all instances (see Project and instance metadata (https://cloud.google.com/compute/docs/storing-retrieving-metadata#project_and_instance_metadata)).
     * 
     */
    @Import(name="metadata")
    private @Nullable Output<Map<String,String>> metadata;

    public Optional<Output<Map<String,String>>> metadata() {
        return Optional.ofNullable(this.metadata);
    }

    /**
     * Optional. The Compute Engine network to be used for machine communications. Cannot be specified with subnetwork_uri. If neither network_uri nor subnetwork_uri is specified, the &#34;default&#34; network of the project is used, if it exists. Cannot be a &#34;Custom Subnet Network&#34; (see Using Subnetworks (https://cloud.google.com/compute/docs/subnetworks) for more information).A full URL, partial URI, or short name are valid. Examples: https://www.googleapis.com/compute/v1/projects/[project_id]/regions/global/default projects/[project_id]/regions/global/default default
     * 
     */
    @Import(name="networkUri")
    private @Nullable Output<String> networkUri;

    public Optional<Output<String>> networkUri() {
        return Optional.ofNullable(this.networkUri);
    }

    /**
     * Optional. Node Group Affinity for sole-tenant clusters.
     * 
     */
    @Import(name="nodeGroupAffinity")
    private @Nullable Output<NodeGroupAffinityArgs> nodeGroupAffinity;

    public Optional<Output<NodeGroupAffinityArgs>> nodeGroupAffinity() {
        return Optional.ofNullable(this.nodeGroupAffinity);
    }

    /**
     * Optional. The type of IPv6 access for a cluster.
     * 
     */
    @Import(name="privateIpv6GoogleAccess")
    private @Nullable Output<GceClusterConfigPrivateIpv6GoogleAccess> privateIpv6GoogleAccess;

    public Optional<Output<GceClusterConfigPrivateIpv6GoogleAccess>> privateIpv6GoogleAccess() {
        return Optional.ofNullable(this.privateIpv6GoogleAccess);
    }

    /**
     * Optional. Reservation Affinity for consuming Zonal reservation.
     * 
     */
    @Import(name="reservationAffinity")
    private @Nullable Output<ReservationAffinityArgs> reservationAffinity;

    public Optional<Output<ReservationAffinityArgs>> reservationAffinity() {
        return Optional.ofNullable(this.reservationAffinity);
    }

    /**
     * Optional. The Dataproc service account (https://cloud.google.com/dataproc/docs/concepts/configuring-clusters/service-accounts#service_accounts_in_dataproc) (also see VM Data Plane identity (https://cloud.google.com/dataproc/docs/concepts/iam/dataproc-principals#vm_service_account_data_plane_identity)) used by Dataproc cluster VM instances to access Google Cloud Platform services.If not specified, the Compute Engine default service account (https://cloud.google.com/compute/docs/access/service-accounts#default_service_account) is used.
     * 
     */
    @Import(name="serviceAccount")
    private @Nullable Output<String> serviceAccount;

    public Optional<Output<String>> serviceAccount() {
        return Optional.ofNullable(this.serviceAccount);
    }

    /**
     * Optional. The URIs of service account scopes to be included in Compute Engine instances. The following base set of scopes is always included: https://www.googleapis.com/auth/cloud.useraccounts.readonly https://www.googleapis.com/auth/devstorage.read_write https://www.googleapis.com/auth/logging.writeIf no scopes are specified, the following defaults are also provided: https://www.googleapis.com/auth/bigquery https://www.googleapis.com/auth/bigtable.admin.table https://www.googleapis.com/auth/bigtable.data https://www.googleapis.com/auth/devstorage.full_control
     * 
     */
    @Import(name="serviceAccountScopes")
    private @Nullable Output<List<String>> serviceAccountScopes;

    public Optional<Output<List<String>>> serviceAccountScopes() {
        return Optional.ofNullable(this.serviceAccountScopes);
    }

    /**
     * Optional. Shielded Instance Config for clusters using Compute Engine Shielded VMs (https://cloud.google.com/security/shielded-cloud/shielded-vm).
     * 
     */
    @Import(name="shieldedInstanceConfig")
    private @Nullable Output<ShieldedInstanceConfigArgs> shieldedInstanceConfig;

    public Optional<Output<ShieldedInstanceConfigArgs>> shieldedInstanceConfig() {
        return Optional.ofNullable(this.shieldedInstanceConfig);
    }

    /**
     * Optional. The Compute Engine subnetwork to be used for machine communications. Cannot be specified with network_uri.A full URL, partial URI, or short name are valid. Examples: https://www.googleapis.com/compute/v1/projects/[project_id]/regions/us-east1/subnetworks/sub0 projects/[project_id]/regions/us-east1/subnetworks/sub0 sub0
     * 
     */
    @Import(name="subnetworkUri")
    private @Nullable Output<String> subnetworkUri;

    public Optional<Output<String>> subnetworkUri() {
        return Optional.ofNullable(this.subnetworkUri);
    }

    /**
     * The Compute Engine tags to add to all instances (see Tagging instances (https://cloud.google.com/compute/docs/label-or-tag-resources#tags)).
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * Optional. The zone where the Compute Engine cluster will be located. On a create request, it is required in the &#34;global&#34; region. If omitted in a non-global Dataproc region, the service will pick a zone in the corresponding Compute Engine region. On a get request, zone will always be present.A full URL, partial URI, or short name are valid. Examples: https://www.googleapis.com/compute/v1/projects/[project_id]/zones/[zone] projects/[project_id]/zones/[zone] us-central1-f
     * 
     */
    @Import(name="zoneUri")
    private @Nullable Output<String> zoneUri;

    public Optional<Output<String>> zoneUri() {
        return Optional.ofNullable(this.zoneUri);
    }

    private GceClusterConfigArgs() {}

    private GceClusterConfigArgs(GceClusterConfigArgs $) {
        this.internalIpOnly = $.internalIpOnly;
        this.metadata = $.metadata;
        this.networkUri = $.networkUri;
        this.nodeGroupAffinity = $.nodeGroupAffinity;
        this.privateIpv6GoogleAccess = $.privateIpv6GoogleAccess;
        this.reservationAffinity = $.reservationAffinity;
        this.serviceAccount = $.serviceAccount;
        this.serviceAccountScopes = $.serviceAccountScopes;
        this.shieldedInstanceConfig = $.shieldedInstanceConfig;
        this.subnetworkUri = $.subnetworkUri;
        this.tags = $.tags;
        this.zoneUri = $.zoneUri;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GceClusterConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GceClusterConfigArgs $;

        public Builder() {
            $ = new GceClusterConfigArgs();
        }

        public Builder(GceClusterConfigArgs defaults) {
            $ = new GceClusterConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder internalIpOnly(@Nullable Output<Boolean> internalIpOnly) {
            $.internalIpOnly = internalIpOnly;
            return this;
        }

        public Builder internalIpOnly(Boolean internalIpOnly) {
            return internalIpOnly(Output.of(internalIpOnly));
        }

        public Builder metadata(@Nullable Output<Map<String,String>> metadata) {
            $.metadata = metadata;
            return this;
        }

        public Builder metadata(Map<String,String> metadata) {
            return metadata(Output.of(metadata));
        }

        public Builder networkUri(@Nullable Output<String> networkUri) {
            $.networkUri = networkUri;
            return this;
        }

        public Builder networkUri(String networkUri) {
            return networkUri(Output.of(networkUri));
        }

        public Builder nodeGroupAffinity(@Nullable Output<NodeGroupAffinityArgs> nodeGroupAffinity) {
            $.nodeGroupAffinity = nodeGroupAffinity;
            return this;
        }

        public Builder nodeGroupAffinity(NodeGroupAffinityArgs nodeGroupAffinity) {
            return nodeGroupAffinity(Output.of(nodeGroupAffinity));
        }

        public Builder privateIpv6GoogleAccess(@Nullable Output<GceClusterConfigPrivateIpv6GoogleAccess> privateIpv6GoogleAccess) {
            $.privateIpv6GoogleAccess = privateIpv6GoogleAccess;
            return this;
        }

        public Builder privateIpv6GoogleAccess(GceClusterConfigPrivateIpv6GoogleAccess privateIpv6GoogleAccess) {
            return privateIpv6GoogleAccess(Output.of(privateIpv6GoogleAccess));
        }

        public Builder reservationAffinity(@Nullable Output<ReservationAffinityArgs> reservationAffinity) {
            $.reservationAffinity = reservationAffinity;
            return this;
        }

        public Builder reservationAffinity(ReservationAffinityArgs reservationAffinity) {
            return reservationAffinity(Output.of(reservationAffinity));
        }

        public Builder serviceAccount(@Nullable Output<String> serviceAccount) {
            $.serviceAccount = serviceAccount;
            return this;
        }

        public Builder serviceAccount(String serviceAccount) {
            return serviceAccount(Output.of(serviceAccount));
        }

        public Builder serviceAccountScopes(@Nullable Output<List<String>> serviceAccountScopes) {
            $.serviceAccountScopes = serviceAccountScopes;
            return this;
        }

        public Builder serviceAccountScopes(List<String> serviceAccountScopes) {
            return serviceAccountScopes(Output.of(serviceAccountScopes));
        }

        public Builder serviceAccountScopes(String... serviceAccountScopes) {
            return serviceAccountScopes(List.of(serviceAccountScopes));
        }

        public Builder shieldedInstanceConfig(@Nullable Output<ShieldedInstanceConfigArgs> shieldedInstanceConfig) {
            $.shieldedInstanceConfig = shieldedInstanceConfig;
            return this;
        }

        public Builder shieldedInstanceConfig(ShieldedInstanceConfigArgs shieldedInstanceConfig) {
            return shieldedInstanceConfig(Output.of(shieldedInstanceConfig));
        }

        public Builder subnetworkUri(@Nullable Output<String> subnetworkUri) {
            $.subnetworkUri = subnetworkUri;
            return this;
        }

        public Builder subnetworkUri(String subnetworkUri) {
            return subnetworkUri(Output.of(subnetworkUri));
        }

        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        public Builder zoneUri(@Nullable Output<String> zoneUri) {
            $.zoneUri = zoneUri;
            return this;
        }

        public Builder zoneUri(String zoneUri) {
            return zoneUri(Output.of(zoneUri));
        }

        public GceClusterConfigArgs build() {
            return $;
        }
    }

}
