// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cognito;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.cognito.UserPoolDomainArgs;
import com.pulumi.aws.cognito.inputs.UserPoolDomainState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a Cognito User Pool Domain resource.
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * Cognito User Pool Domains can be imported using the `domain`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:cognito/userPoolDomain:UserPoolDomain main &lt;domain&gt;
 * ```
 * 
 */
@ResourceType(type="aws:cognito/userPoolDomain:UserPoolDomain")
public class UserPoolDomain extends com.pulumi.resources.CustomResource {
    /**
     * The AWS account ID for the user pool owner.
     * 
     */
    @Export(name="awsAccountId", type=String.class, parameters={})
    private Output<String> awsAccountId;

    /**
     * @return The AWS account ID for the user pool owner.
     * 
     */
    public Output<String> awsAccountId() {
        return this.awsAccountId;
    }
    /**
     * The ARN of an ISSUED ACM certificate in us-east-1 for a custom domain.
     * 
     */
    @Export(name="certificateArn", type=String.class, parameters={})
    private Output</* @Nullable */ String> certificateArn;

    /**
     * @return The ARN of an ISSUED ACM certificate in us-east-1 for a custom domain.
     * 
     */
    public Output</* @Nullable */ String> certificateArn() {
        return this.certificateArn;
    }
    /**
     * The URL of the CloudFront distribution. This is required to generate the ALIAS `aws.route53.Record`
     * 
     */
    @Export(name="cloudfrontDistributionArn", type=String.class, parameters={})
    private Output<String> cloudfrontDistributionArn;

    /**
     * @return The URL of the CloudFront distribution. This is required to generate the ALIAS `aws.route53.Record`
     * 
     */
    public Output<String> cloudfrontDistributionArn() {
        return this.cloudfrontDistributionArn;
    }
    /**
     * The domain string.
     * 
     */
    @Export(name="domain", type=String.class, parameters={})
    private Output<String> domain;

    /**
     * @return The domain string.
     * 
     */
    public Output<String> domain() {
        return this.domain;
    }
    /**
     * The S3 bucket where the static files for this domain are stored.
     * 
     */
    @Export(name="s3Bucket", type=String.class, parameters={})
    private Output<String> s3Bucket;

    /**
     * @return The S3 bucket where the static files for this domain are stored.
     * 
     */
    public Output<String> s3Bucket() {
        return this.s3Bucket;
    }
    /**
     * The user pool ID.
     * 
     */
    @Export(name="userPoolId", type=String.class, parameters={})
    private Output<String> userPoolId;

    /**
     * @return The user pool ID.
     * 
     */
    public Output<String> userPoolId() {
        return this.userPoolId;
    }
    /**
     * The app version.
     * 
     */
    @Export(name="version", type=String.class, parameters={})
    private Output<String> version;

    /**
     * @return The app version.
     * 
     */
    public Output<String> version() {
        return this.version;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public UserPoolDomain(String name) {
        this(name, UserPoolDomainArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public UserPoolDomain(String name, UserPoolDomainArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public UserPoolDomain(String name, UserPoolDomainArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:cognito/userPoolDomain:UserPoolDomain", name, args == null ? UserPoolDomainArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private UserPoolDomain(String name, Output<String> id, @Nullable UserPoolDomainState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:cognito/userPoolDomain:UserPoolDomain", name, state, makeResourceOptions(options, id));
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
    public static UserPoolDomain get(String name, Output<String> id, @Nullable UserPoolDomainState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new UserPoolDomain(name, id, state, options);
    }
}
