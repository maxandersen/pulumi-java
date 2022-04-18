// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.apimanagement.outputs;

import com.pulumi.azurenative.apimanagement.outputs.GroupContractPropertiesResponse;
import com.pulumi.azurenative.apimanagement.outputs.UserIdentityContractResponse;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetUserResult {
    /**
     * Email address.
     * 
     */
    private final @Nullable String email;
    /**
     * First name.
     * 
     */
    private final @Nullable String firstName;
    /**
     * Collection of groups user is part of.
     * 
     */
    private final List<GroupContractPropertiesResponse> groups;
    /**
     * Resource ID.
     * 
     */
    private final String id;
    /**
     * Collection of user identities.
     * 
     */
    private final @Nullable List<UserIdentityContractResponse> identities;
    /**
     * Last name.
     * 
     */
    private final @Nullable String lastName;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * Optional note about a user set by the administrator.
     * 
     */
    private final @Nullable String note;
    /**
     * Date of user registration. The date conforms to the following format: `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601 standard.
     * 
     */
    private final @Nullable String registrationDate;
    /**
     * Account state. Specifies whether the user is active or not. Blocked users are unable to sign into the developer portal or call any APIs of subscribed products. Default state is Active.
     * 
     */
    private final @Nullable String state;
    /**
     * Resource type for API Management resource.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetUserResult(
        @CustomType.Parameter("email") @Nullable String email,
        @CustomType.Parameter("firstName") @Nullable String firstName,
        @CustomType.Parameter("groups") List<GroupContractPropertiesResponse> groups,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("identities") @Nullable List<UserIdentityContractResponse> identities,
        @CustomType.Parameter("lastName") @Nullable String lastName,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("note") @Nullable String note,
        @CustomType.Parameter("registrationDate") @Nullable String registrationDate,
        @CustomType.Parameter("state") @Nullable String state,
        @CustomType.Parameter("type") String type) {
        this.email = email;
        this.firstName = firstName;
        this.groups = groups;
        this.id = id;
        this.identities = identities;
        this.lastName = lastName;
        this.name = name;
        this.note = note;
        this.registrationDate = registrationDate;
        this.state = state;
        this.type = type;
    }

    /**
     * Email address.
     * 
    */
    public Optional<String> email() {
        return Optional.ofNullable(this.email);
    }
    /**
     * First name.
     * 
    */
    public Optional<String> firstName() {
        return Optional.ofNullable(this.firstName);
    }
    /**
     * Collection of groups user is part of.
     * 
    */
    public List<GroupContractPropertiesResponse> groups() {
        return this.groups;
    }
    /**
     * Resource ID.
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * Collection of user identities.
     * 
    */
    public List<UserIdentityContractResponse> identities() {
        return this.identities == null ? List.of() : this.identities;
    }
    /**
     * Last name.
     * 
    */
    public Optional<String> lastName() {
        return Optional.ofNullable(this.lastName);
    }
    /**
     * Resource name.
     * 
    */
    public String name() {
        return this.name;
    }
    /**
     * Optional note about a user set by the administrator.
     * 
    */
    public Optional<String> note() {
        return Optional.ofNullable(this.note);
    }
    /**
     * Date of user registration. The date conforms to the following format: `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601 standard.
     * 
    */
    public Optional<String> registrationDate() {
        return Optional.ofNullable(this.registrationDate);
    }
    /**
     * Account state. Specifies whether the user is active or not. Blocked users are unable to sign into the developer portal or call any APIs of subscribed products. Default state is Active.
     * 
    */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }
    /**
     * Resource type for API Management resource.
     * 
    */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetUserResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String email;
        private @Nullable String firstName;
        private List<GroupContractPropertiesResponse> groups;
        private String id;
        private @Nullable List<UserIdentityContractResponse> identities;
        private @Nullable String lastName;
        private String name;
        private @Nullable String note;
        private @Nullable String registrationDate;
        private @Nullable String state;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetUserResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.email = defaults.email;
    	      this.firstName = defaults.firstName;
    	      this.groups = defaults.groups;
    	      this.id = defaults.id;
    	      this.identities = defaults.identities;
    	      this.lastName = defaults.lastName;
    	      this.name = defaults.name;
    	      this.note = defaults.note;
    	      this.registrationDate = defaults.registrationDate;
    	      this.state = defaults.state;
    	      this.type = defaults.type;
        }

        public Builder email(@Nullable String email) {
            this.email = email;
            return this;
        }
        public Builder firstName(@Nullable String firstName) {
            this.firstName = firstName;
            return this;
        }
        public Builder groups(List<GroupContractPropertiesResponse> groups) {
            this.groups = Objects.requireNonNull(groups);
            return this;
        }
        public Builder groups(GroupContractPropertiesResponse... groups) {
            return groups(List.of(groups));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder identities(@Nullable List<UserIdentityContractResponse> identities) {
            this.identities = identities;
            return this;
        }
        public Builder identities(UserIdentityContractResponse... identities) {
            return identities(List.of(identities));
        }
        public Builder lastName(@Nullable String lastName) {
            this.lastName = lastName;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder note(@Nullable String note) {
            this.note = note;
            return this;
        }
        public Builder registrationDate(@Nullable String registrationDate) {
            this.registrationDate = registrationDate;
            return this;
        }
        public Builder state(@Nullable String state) {
            this.state = state;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetUserResult build() {
            return new GetUserResult(email, firstName, groups, id, identities, lastName, name, note, registrationDate, state, type);
        }
    }
}
