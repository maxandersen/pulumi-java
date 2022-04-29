// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.confluent;

import com.pulumi.azurenative.Utilities;
import com.pulumi.azurenative.confluent.OrganizationArgs;
import com.pulumi.azurenative.confluent.outputs.OrganizationResourcePropertiesResponseOfferDetail;
import com.pulumi.azurenative.confluent.outputs.OrganizationResourcePropertiesResponseUserDetail;
import com.pulumi.core.Alias;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.resources.CustomResource;
import com.pulumi.resources.CustomResourceOptions;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Organization resource.
 * API Version: 2020-03-01.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * An existing resource can be imported using its type token, name, and identifier, e.g.
 * 
 * ```sh
 * $ pulumi import azure-native:confluent:Organization myOrganization /subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myResourceGroup/providers/Microsoft.Confluent/organizations/myOrganization 
 * ```
 * 
 */
@ResourceType(type="azure-native:confluent:Organization")
public class Organization extends CustomResource {
    /**
     * The creation time of the resource.
     * 
     */
    @Export(name="createdTime", type=String.class, parameters={})
    private Output<String> createdTime;

    /**
     * @return The creation time of the resource.
     * 
     */
    public Output<String> createdTime() {
        return this.createdTime;
    }
    /**
     * Location of Organization resource
     * 
     */
    @Export(name="location", type=String.class, parameters={})
    private Output</* @Nullable */ String> location;

    /**
     * @return Location of Organization resource
     * 
     */
    public Output<Optional<String>> location() {
        return Codegen.optional(this.location);
    }
    /**
     * The name of the resource.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the resource.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Confluent offer detail
     * 
     */
    @Export(name="offerDetail", type=OrganizationResourcePropertiesResponseOfferDetail.class, parameters={})
    private Output</* @Nullable */ OrganizationResourcePropertiesResponseOfferDetail> offerDetail;

    /**
     * @return Confluent offer detail
     * 
     */
    public Output<Optional<OrganizationResourcePropertiesResponseOfferDetail>> offerDetail() {
        return Codegen.optional(this.offerDetail);
    }
    /**
     * Id of the Confluent organization.
     * 
     */
    @Export(name="organizationId", type=String.class, parameters={})
    private Output<String> organizationId;

    /**
     * @return Id of the Confluent organization.
     * 
     */
    public Output<String> organizationId() {
        return this.organizationId;
    }
    /**
     * Provision states for confluent RP
     * 
     */
    @Export(name="provisioningState", type=String.class, parameters={})
    private Output<String> provisioningState;

    /**
     * @return Provision states for confluent RP
     * 
     */
    public Output<String> provisioningState() {
        return this.provisioningState;
    }
    /**
     * SSO url for the Confluent organization.
     * 
     */
    @Export(name="ssoUrl", type=String.class, parameters={})
    private Output<String> ssoUrl;

    /**
     * @return SSO url for the Confluent organization.
     * 
     */
    public Output<String> ssoUrl() {
        return this.ssoUrl;
    }
    /**
     * Organization resource tags
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Organization resource tags
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * The type of the resource.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of the resource.
     * 
     */
    public Output<String> type() {
        return this.type;
    }
    /**
     * Subscriber detail
     * 
     */
    @Export(name="userDetail", type=OrganizationResourcePropertiesResponseUserDetail.class, parameters={})
    private Output</* @Nullable */ OrganizationResourcePropertiesResponseUserDetail> userDetail;

    /**
     * @return Subscriber detail
     * 
     */
    public Output<Optional<OrganizationResourcePropertiesResponseUserDetail>> userDetail() {
        return Codegen.optional(this.userDetail);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Organization(String name) {
        this(name, OrganizationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Organization(String name, OrganizationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Organization(String name, OrganizationArgs args, @Nullable CustomResourceOptions options) {
        super("azure-native:confluent:Organization", name, args == null ? OrganizationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Organization(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        super("azure-native:confluent:Organization", name, null, makeResourceOptions(options, id));
    }

    private static CustomResourceOptions makeResourceOptions(@Nullable CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .aliases(List.of(
                Output.of(Alias.builder().type("azure-native:confluent/v20200301:Organization").build()),
                Output.of(Alias.builder().type("azure-native:confluent/v20200301preview:Organization").build()),
                Output.of(Alias.builder().type("azure-native:confluent/v20210301preview:Organization").build()),
                Output.of(Alias.builder().type("azure-native:confluent/v20210901preview:Organization").build())
            ))
            .build();
        return CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Organization get(String name, Output<String> id, @Nullable CustomResourceOptions options) {
        return new Organization(name, id, options);
    }
}
