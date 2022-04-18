// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.storage_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.Utilities;
import com.pulumi.googlenative.storage_v1.ObjectAccessControlArgs;
import com.pulumi.googlenative.storage_v1.outputs.ObjectAccessControlProjectTeamResponse;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a new ACL entry on the specified object.
 * Auto-naming is currently not supported for this resource.
 * 
 */
@ResourceType(type="google-native:storage/v1:ObjectAccessControl")
public class ObjectAccessControl extends com.pulumi.resources.CustomResource {
    /**
     * The name of the bucket.
     * 
     */
    @Export(name="bucket", type=String.class, parameters={})
    private Output<String> bucket;

    /**
     * @return The name of the bucket.
     * 
     */
    public Output<String> bucket() {
        return this.bucket;
    }
    /**
     * The domain associated with the entity, if any.
     * 
     */
    @Export(name="domain", type=String.class, parameters={})
    private Output<String> domain;

    /**
     * @return The domain associated with the entity, if any.
     * 
     */
    public Output<String> domain() {
        return this.domain;
    }
    /**
     * The email address associated with the entity, if any.
     * 
     */
    @Export(name="email", type=String.class, parameters={})
    private Output<String> email;

    /**
     * @return The email address associated with the entity, if any.
     * 
     */
    public Output<String> email() {
        return this.email;
    }
    /**
     * The entity holding the permission, in one of the following forms:
     * - user-userId
     * - user-email
     * - group-groupId
     * - group-email
     * - domain-domain
     * - project-team-projectId
     * - allUsers
     * - allAuthenticatedUsers Examples:
     * - The user liz@example.com would be user-liz@example.com.
     * - The group example@googlegroups.com would be group-example@googlegroups.com.
     * - To refer to all members of the Google Apps for Business domain example.com, the entity would be domain-example.com.
     * 
     */
    @Export(name="entity", type=String.class, parameters={})
    private Output<String> entity;

    /**
     * @return The entity holding the permission, in one of the following forms:
     * - user-userId
     * - user-email
     * - group-groupId
     * - group-email
     * - domain-domain
     * - project-team-projectId
     * - allUsers
     * - allAuthenticatedUsers Examples:
     * - The user liz@example.com would be user-liz@example.com.
     * - The group example@googlegroups.com would be group-example@googlegroups.com.
     * - To refer to all members of the Google Apps for Business domain example.com, the entity would be domain-example.com.
     * 
     */
    public Output<String> entity() {
        return this.entity;
    }
    /**
     * The ID for the entity, if any.
     * 
     */
    @Export(name="entityId", type=String.class, parameters={})
    private Output<String> entityId;

    /**
     * @return The ID for the entity, if any.
     * 
     */
    public Output<String> entityId() {
        return this.entityId;
    }
    /**
     * HTTP 1.1 Entity tag for the access-control entry.
     * 
     */
    @Export(name="etag", type=String.class, parameters={})
    private Output<String> etag;

    /**
     * @return HTTP 1.1 Entity tag for the access-control entry.
     * 
     */
    public Output<String> etag() {
        return this.etag;
    }
    /**
     * The content generation of the object, if applied to an object.
     * 
     */
    @Export(name="generation", type=String.class, parameters={})
    private Output<String> generation;

    /**
     * @return The content generation of the object, if applied to an object.
     * 
     */
    public Output<String> generation() {
        return this.generation;
    }
    /**
     * The kind of item this is. For object access control entries, this is always storage#objectAccessControl.
     * 
     */
    @Export(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return The kind of item this is. For object access control entries, this is always storage#objectAccessControl.
     * 
     */
    public Output<String> kind() {
        return this.kind;
    }
    /**
     * The name of the object, if applied to an object.
     * 
     */
    @Export(name="object", type=String.class, parameters={})
    private Output<String> object;

    /**
     * @return The name of the object, if applied to an object.
     * 
     */
    public Output<String> object() {
        return this.object;
    }
    /**
     * The project team associated with the entity, if any.
     * 
     */
    @Export(name="projectTeam", type=ObjectAccessControlProjectTeamResponse.class, parameters={})
    private Output<ObjectAccessControlProjectTeamResponse> projectTeam;

    /**
     * @return The project team associated with the entity, if any.
     * 
     */
    public Output<ObjectAccessControlProjectTeamResponse> projectTeam() {
        return this.projectTeam;
    }
    /**
     * The access permission for the entity.
     * 
     */
    @Export(name="role", type=String.class, parameters={})
    private Output<String> role;

    /**
     * @return The access permission for the entity.
     * 
     */
    public Output<String> role() {
        return this.role;
    }
    /**
     * The link to this access-control entry.
     * 
     */
    @Export(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return The link to this access-control entry.
     * 
     */
    public Output<String> selfLink() {
        return this.selfLink;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ObjectAccessControl(String name) {
        this(name, ObjectAccessControlArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ObjectAccessControl(String name, ObjectAccessControlArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ObjectAccessControl(String name, ObjectAccessControlArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:storage/v1:ObjectAccessControl", name, args == null ? ObjectAccessControlArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ObjectAccessControl(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("google-native:storage/v1:ObjectAccessControl", name, null, makeResourceOptions(options, id));
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
    public static ObjectAccessControl get(String name, Output<String> id, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ObjectAccessControl(name, id, options);
    }
}
