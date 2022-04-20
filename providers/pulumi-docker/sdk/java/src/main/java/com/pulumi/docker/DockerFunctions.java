// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.docker;

import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import com.pulumi.docker.Utilities;
import com.pulumi.docker.inputs.GetNetworkArgs;
import com.pulumi.docker.inputs.GetPluginArgs;
import com.pulumi.docker.inputs.GetRegistryImageArgs;
import com.pulumi.docker.inputs.GetRemoteImageArgs;
import com.pulumi.docker.outputs.GetNetworkResult;
import com.pulumi.docker.outputs.GetPluginResult;
import com.pulumi.docker.outputs.GetRegistryImageResult;
import com.pulumi.docker.outputs.GetRemoteImageResult;
import java.util.concurrent.CompletableFuture;

public final class DockerFunctions {
    /**
     * `docker.Network` provides details about a specific Docker Network.
     * 
     * ## Example Usage
     * ## Schema
     * 
     * ### Required
     * 
     * - **name** (String) The name of the Docker network.
     * 
     * ### Read-Only
     * 
     * - **driver** (String) The driver of the Docker network. Possible values are `bridge`, `host`, `overlay`, `macvlan`. See [network docs](https://docs.docker.com/network/#network-drivers) for more details.
     * - **id** (String) The ID of this resource.
     * - **internal** (Boolean) If `true`, the network is internal.
     * - **ipam_config** (Set of Object) The IPAM configuration options (see below for nested schema)
     * - **options** (Map of String) Only available with bridge networks. See [bridge options docs](https://docs.docker.com/engine/reference/commandline/network_create/#bridge-driver-options) for more details.
     * - **scope** (String) Scope of the network. One of `swarm`, `global`, or `local`.
     * 
     * &lt;a id=&#34;nestedatt--ipam_config&#34;&gt;&lt;/a&gt;
     * ### Nested Schema for `ipam_config`
     * 
     * Read-Only:
     * 
     * - **aux_address** (Map of String)
     * - **gateway** (String)
     * - **ip_range** (String)
     * - **subnet** (String)
     * 
     */
    public static CompletableFuture<GetNetworkResult> getNetwork(GetNetworkArgs args) {
        return getNetwork(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetNetworkResult> getNetwork(GetNetworkArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("docker:index/getNetwork:getNetwork", TypeShape.of(GetNetworkResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Reads the local Docker plugin. The plugin must be installed locally.
     * 
     * ## Example Usage
     * 
     * ### With alias
     * data &#34;docker.Plugin&#34; &#34;by_alias&#34; {
     *   alias = &#34;sample-volume-plugin:latest&#34;
     * }
     * ## Schema
     * 
     * ### Optional
     * 
     * - **alias** (String) The alias of the Docker plugin. If the tag is omitted, `:latest` is complemented to the attribute value.
     * - **id** (String) The ID of the plugin, which has precedence over the `alias` of both are given
     * 
     * ### Read-Only
     * 
     * - **enabled** (Boolean) If `true` the plugin is enabled
     * - **env** (Set of String) The environment variables in the form of `KEY=VALUE`, e.g. `DEBUG=0`
     * - **grant_all_permissions** (Boolean) If true, grant all permissions necessary to run the plugin
     * - **name** (String) The plugin name. If the tag is omitted, `:latest` is complemented to the attribute value.
     * - **plugin_reference** (String) The Docker Plugin Reference
     * 
     */
    public static CompletableFuture<GetPluginResult> getPlugin() {
        return getPlugin(GetPluginArgs.Empty, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetPluginResult> getPlugin(GetPluginArgs args) {
        return getPlugin(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetPluginResult> getPlugin(GetPluginArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("docker:index/getPlugin:getPlugin", TypeShape.of(GetPluginResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Reads the image metadata from a Docker Registry. Used in conjunction with the docker.RemoteImage resource to keep an image up to date on the latest available version of the tag.
     * 
     * ## Example Usage
     * ## Schema
     * 
     * ### Required
     * 
     * - **name** (String) The name of the Docker image, including any tags. e.g. `alpine:latest`
     * 
     * ### Optional
     * 
     * - **id** (String) The ID of this resource.
     * - **insecure_skip_verify** (Boolean) If `true`, the verification of TLS certificates of the server/registry is disabled. Defaults to `false`
     * 
     * ### Read-Only
     * 
     * - **sha256_digest** (String) The content digest of the image, as stored in the registry.
     * 
     */
    public static CompletableFuture<GetRegistryImageResult> getRegistryImage(GetRegistryImageArgs args) {
        return getRegistryImage(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetRegistryImageResult> getRegistryImage(GetRegistryImageArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("docker:index/getRegistryImage:getRegistryImage", TypeShape.of(GetRegistryImageResult.class), args, Utilities.withVersion(options));
    }
    /**
     * `docker.RemoteImage` provides details about a specific Docker Image which need to be presend on the Docker Host
     * 
     * ## Example Usage
     * ## Schema
     * 
     * ### Required
     * 
     * - **name** (String) The name of the Docker image, including any tags or SHA256 repo digests.
     * 
     * ### Optional
     * 
     * - **id** (String) The ID of this resource.
     * 
     * ### Read-Only
     * 
     * - **repo_digest** (String) The image sha256 digest in the form of `repo[:tag]@sha256:&lt;hash&gt;`. It may be empty in the edge case where the local image was pulled from a repo, tagged locally, and then referred to in the data source by that local name/tag.
     * 
     */
    public static CompletableFuture<GetRemoteImageResult> getRemoteImage(GetRemoteImageArgs args) {
        return getRemoteImage(args, InvokeOptions.Empty);
    }
    public static CompletableFuture<GetRemoteImageResult> getRemoteImage(GetRemoteImageArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("docker:index/getRemoteImage:getRemoteImage", TypeShape.of(GetRemoteImageResult.class), args, Utilities.withVersion(options));
    }
}
