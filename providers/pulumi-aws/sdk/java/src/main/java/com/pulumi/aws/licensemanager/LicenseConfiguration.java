// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.licensemanager;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.licensemanager.LicenseConfigurationArgs;
import com.pulumi.aws.licensemanager.inputs.LicenseConfigurationState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a License Manager license configuration resource.
 * 
 * &gt; **Note:** Removing the `license_count` attribute is not supported by the License Manager API - recreate the resource instead.
 * 
 * ## Example Usage
 * ## Rules
 * 
 * License rules should be in the format of `#RuleType=RuleValue`. Supported rule types:
 * 
 * * `minimumVcpus` - Resource must have minimum vCPU count in order to use the license. Default: 1
 * * `maximumVcpus` - Resource must have maximum vCPU count in order to use the license. Default: unbounded, limit: 10000
 * * `minimumCores` - Resource must have minimum core count in order to use the license. Default: 1
 * * `maximumCores` - Resource must have maximum core count in order to use the license. Default: unbounded, limit: 10000
 * * `minimumSockets` - Resource must have minimum socket count in order to use the license. Default: 1
 * * `maximumSockets` - Resource must have maximum socket count in order to use the license. Default: unbounded, limit: 10000
 * * `allowedTenancy` - Defines where the license can be used. If set, restricts license usage to selected tenancies. Specify a comma delimited list of `EC2-Default`, `EC2-DedicatedHost`, `EC2-DedicatedInstance`
 * 
 * ## Import
 * 
 * License configurations can be imported using the `id`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:licensemanager/licenseConfiguration:LicenseConfiguration example arn:aws:license-manager:eu-west-1:123456789012:license-configuration:lic-0123456789abcdef0123456789abcdef
 * ```
 * 
 */
@ResourceType(type="aws:licensemanager/licenseConfiguration:LicenseConfiguration")
public class LicenseConfiguration extends com.pulumi.resources.CustomResource {
    /**
     * The license configuration ARN.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The license configuration ARN.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Description of the license configuration.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the license configuration.
     * 
     */
    public Output</* @Nullable */ String> description() {
        return this.description;
    }
    /**
     * Number of licenses managed by the license configuration.
     * 
     */
    @Export(name="licenseCount", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> licenseCount;

    /**
     * @return Number of licenses managed by the license configuration.
     * 
     */
    public Output</* @Nullable */ Integer> licenseCount() {
        return this.licenseCount;
    }
    /**
     * Sets the number of available licenses as a hard limit.
     * 
     */
    @Export(name="licenseCountHardLimit", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> licenseCountHardLimit;

    /**
     * @return Sets the number of available licenses as a hard limit.
     * 
     */
    public Output</* @Nullable */ Boolean> licenseCountHardLimit() {
        return this.licenseCountHardLimit;
    }
    /**
     * Dimension to use to track license inventory. Specify either `vCPU`, `Instance`, `Core` or `Socket`.
     * 
     */
    @Export(name="licenseCountingType", type=String.class, parameters={})
    private Output<String> licenseCountingType;

    /**
     * @return Dimension to use to track license inventory. Specify either `vCPU`, `Instance`, `Core` or `Socket`.
     * 
     */
    public Output<String> licenseCountingType() {
        return this.licenseCountingType;
    }
    /**
     * Array of configured License Manager rules.
     * 
     */
    @Export(name="licenseRules", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> licenseRules;

    /**
     * @return Array of configured License Manager rules.
     * 
     */
    public Output</* @Nullable */ List<String>> licenseRules() {
        return this.licenseRules;
    }
    /**
     * Name of the license configuration.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the license configuration.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Account ID of the owner of the license configuration.
     * 
     */
    @Export(name="ownerAccountId", type=String.class, parameters={})
    private Output<String> ownerAccountId;

    /**
     * @return Account ID of the owner of the license configuration.
     * 
     */
    public Output<String> ownerAccountId() {
        return this.ownerAccountId;
    }
    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> tags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LicenseConfiguration(String name) {
        this(name, LicenseConfigurationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LicenseConfiguration(String name, LicenseConfigurationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LicenseConfiguration(String name, LicenseConfigurationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:licensemanager/licenseConfiguration:LicenseConfiguration", name, args == null ? LicenseConfigurationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private LicenseConfiguration(String name, Output<String> id, @Nullable LicenseConfigurationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:licensemanager/licenseConfiguration:LicenseConfiguration", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static LicenseConfiguration get(String name, Output<String> id, @Nullable LicenseConfigurationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LicenseConfiguration(name, id, state, options);
    }
}
