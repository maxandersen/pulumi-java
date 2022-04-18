// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.storage_v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.storage_v1.outputs.ObjectAccessControlProjectTeamResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class ObjectAccessControlResponse {
    /**
     * The name of the bucket.
     * 
     */
    private final String bucket;
    /**
     * The domain associated with the entity, if any.
     * 
     */
    private final String domain;
    /**
     * The email address associated with the entity, if any.
     * 
     */
    private final String email;
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
    private final String entity;
    /**
     * The ID for the entity, if any.
     * 
     */
    private final String entityId;
    /**
     * HTTP 1.1 Entity tag for the access-control entry.
     * 
     */
    private final String etag;
    /**
     * The content generation of the object, if applied to an object.
     * 
     */
    private final String generation;
    /**
     * The kind of item this is. For object access control entries, this is always storage#objectAccessControl.
     * 
     */
    private final String kind;
    /**
     * The name of the object, if applied to an object.
     * 
     */
    private final String object;
    /**
     * The project team associated with the entity, if any.
     * 
     */
    private final ObjectAccessControlProjectTeamResponse projectTeam;
    /**
     * The access permission for the entity.
     * 
     */
    private final String role;
    /**
     * The link to this access-control entry.
     * 
     */
    private final String selfLink;

    @CustomType.Constructor
    private ObjectAccessControlResponse(
        @CustomType.Parameter("bucket") String bucket,
        @CustomType.Parameter("domain") String domain,
        @CustomType.Parameter("email") String email,
        @CustomType.Parameter("entity") String entity,
        @CustomType.Parameter("entityId") String entityId,
        @CustomType.Parameter("etag") String etag,
        @CustomType.Parameter("generation") String generation,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("object") String object,
        @CustomType.Parameter("projectTeam") ObjectAccessControlProjectTeamResponse projectTeam,
        @CustomType.Parameter("role") String role,
        @CustomType.Parameter("selfLink") String selfLink) {
        this.bucket = bucket;
        this.domain = domain;
        this.email = email;
        this.entity = entity;
        this.entityId = entityId;
        this.etag = etag;
        this.generation = generation;
        this.kind = kind;
        this.object = object;
        this.projectTeam = projectTeam;
        this.role = role;
        this.selfLink = selfLink;
    }

    /**
     * The name of the bucket.
     * 
    */
    public String bucket() {
        return this.bucket;
    }
    /**
     * The domain associated with the entity, if any.
     * 
    */
    public String domain() {
        return this.domain;
    }
    /**
     * The email address associated with the entity, if any.
     * 
    */
    public String email() {
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
    public String entity() {
        return this.entity;
    }
    /**
     * The ID for the entity, if any.
     * 
    */
    public String entityId() {
        return this.entityId;
    }
    /**
     * HTTP 1.1 Entity tag for the access-control entry.
     * 
    */
    public String etag() {
        return this.etag;
    }
    /**
     * The content generation of the object, if applied to an object.
     * 
    */
    public String generation() {
        return this.generation;
    }
    /**
     * The kind of item this is. For object access control entries, this is always storage#objectAccessControl.
     * 
    */
    public String kind() {
        return this.kind;
    }
    /**
     * The name of the object, if applied to an object.
     * 
    */
    public String object() {
        return this.object;
    }
    /**
     * The project team associated with the entity, if any.
     * 
    */
    public ObjectAccessControlProjectTeamResponse projectTeam() {
        return this.projectTeam;
    }
    /**
     * The access permission for the entity.
     * 
    */
    public String role() {
        return this.role;
    }
    /**
     * The link to this access-control entry.
     * 
    */
    public String selfLink() {
        return this.selfLink;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ObjectAccessControlResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bucket;
        private String domain;
        private String email;
        private String entity;
        private String entityId;
        private String etag;
        private String generation;
        private String kind;
        private String object;
        private ObjectAccessControlProjectTeamResponse projectTeam;
        private String role;
        private String selfLink;

        public Builder() {
    	      // Empty
        }

        public Builder(ObjectAccessControlResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.domain = defaults.domain;
    	      this.email = defaults.email;
    	      this.entity = defaults.entity;
    	      this.entityId = defaults.entityId;
    	      this.etag = defaults.etag;
    	      this.generation = defaults.generation;
    	      this.kind = defaults.kind;
    	      this.object = defaults.object;
    	      this.projectTeam = defaults.projectTeam;
    	      this.role = defaults.role;
    	      this.selfLink = defaults.selfLink;
        }

        public Builder bucket(String bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }
        public Builder domain(String domain) {
            this.domain = Objects.requireNonNull(domain);
            return this;
        }
        public Builder email(String email) {
            this.email = Objects.requireNonNull(email);
            return this;
        }
        public Builder entity(String entity) {
            this.entity = Objects.requireNonNull(entity);
            return this;
        }
        public Builder entityId(String entityId) {
            this.entityId = Objects.requireNonNull(entityId);
            return this;
        }
        public Builder etag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }
        public Builder generation(String generation) {
            this.generation = Objects.requireNonNull(generation);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder object(String object) {
            this.object = Objects.requireNonNull(object);
            return this;
        }
        public Builder projectTeam(ObjectAccessControlProjectTeamResponse projectTeam) {
            this.projectTeam = Objects.requireNonNull(projectTeam);
            return this;
        }
        public Builder role(String role) {
            this.role = Objects.requireNonNull(role);
            return this;
        }
        public Builder selfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }        public ObjectAccessControlResponse build() {
            return new ObjectAccessControlResponse(bucket, domain, email, entity, entityId, etag, generation, kind, object, projectTeam, role, selfLink);
        }
    }
}
