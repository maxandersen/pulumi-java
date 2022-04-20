// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.elasticache;

import com.pulumi.awsnative.Utilities;
import com.pulumi.awsnative.elasticache.UserArgs;
import com.pulumi.awsnative.elasticache.enums.UserEngine;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Resource Type definition for AWS::ElastiCache::User
 * 
 */
@ResourceType(type="aws-native:elasticache:User")
public class User extends com.pulumi.resources.CustomResource {
    /**
     * Access permissions string used for this user account.
     * 
     */
    @Export(name="accessString", type=String.class, parameters={})
    private Output</* @Nullable */ String> accessString;

    /**
     * @return Access permissions string used for this user account.
     * 
     */
    public Output</* @Nullable */ String> accessString() {
        return this.accessString;
    }
    /**
     * The Amazon Resource Name (ARN) of the user account.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the user account.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Must be redis.
     * 
     */
    @Export(name="engine", type=UserEngine.class, parameters={})
    private Output<UserEngine> engine;

    /**
     * @return Must be redis.
     * 
     */
    public Output<UserEngine> engine() {
        return this.engine;
    }
    /**
     * Indicates a password is not required for this user account.
     * 
     */
    @Export(name="noPasswordRequired", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> noPasswordRequired;

    /**
     * @return Indicates a password is not required for this user account.
     * 
     */
    public Output</* @Nullable */ Boolean> noPasswordRequired() {
        return this.noPasswordRequired;
    }
    /**
     * Passwords used for this user account. You can create up to two passwords for each user.
     * 
     */
    @Export(name="passwords", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> passwords;

    /**
     * @return Passwords used for this user account. You can create up to two passwords for each user.
     * 
     */
    public Output</* @Nullable */ List<String>> passwords() {
        return this.passwords;
    }
    /**
     * Indicates the user status. Can be &#34;active&#34;, &#34;modifying&#34; or &#34;deleting&#34;.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return Indicates the user status. Can be &#34;active&#34;, &#34;modifying&#34; or &#34;deleting&#34;.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * The ID of the user.
     * 
     */
    @Export(name="userId", type=String.class, parameters={})
    private Output<String> userId;

    /**
     * @return The ID of the user.
     * 
     */
    public Output<String> userId() {
        return this.userId;
    }
    /**
     * The username of the user.
     * 
     */
    @Export(name="userName", type=String.class, parameters={})
    private Output<String> userName;

    /**
     * @return The username of the user.
     * 
     */
    public Output<String> userName() {
        return this.userName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public User(String name) {
        this(name, UserArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public User(String name, UserArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public User(String name, UserArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:elasticache:User", name, args == null ? UserArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private User(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws-native:elasticache:User", name, null, makeResourceOptions(options, id));
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
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static User get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new User(name, id, options);
    }
}
