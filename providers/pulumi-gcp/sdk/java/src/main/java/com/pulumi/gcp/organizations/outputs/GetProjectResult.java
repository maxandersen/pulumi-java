// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.organizations.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetProjectResult {
    private final Boolean autoCreateNetwork;
    private final String billingAccount;
    private final String folderId;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final Map<String,String> labels;
    private final String name;
    /**
     * The numeric identifier of the project.
     * 
     */
    private final String number;
    private final String orgId;
    private final @Nullable String projectId;
    private final Boolean skipDelete;

    @CustomType.Constructor
    private GetProjectResult(
        @CustomType.Parameter("autoCreateNetwork") Boolean autoCreateNetwork,
        @CustomType.Parameter("billingAccount") String billingAccount,
        @CustomType.Parameter("folderId") String folderId,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("number") String number,
        @CustomType.Parameter("orgId") String orgId,
        @CustomType.Parameter("projectId") @Nullable String projectId,
        @CustomType.Parameter("skipDelete") Boolean skipDelete) {
        this.autoCreateNetwork = autoCreateNetwork;
        this.billingAccount = billingAccount;
        this.folderId = folderId;
        this.id = id;
        this.labels = labels;
        this.name = name;
        this.number = number;
        this.orgId = orgId;
        this.projectId = projectId;
        this.skipDelete = skipDelete;
    }

    public Boolean autoCreateNetwork() {
        return this.autoCreateNetwork;
    }
    public String billingAccount() {
        return this.billingAccount;
    }
    public String folderId() {
        return this.folderId;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String id() {
        return this.id;
    }
    public Map<String,String> labels() {
        return this.labels;
    }
    public String name() {
        return this.name;
    }
    /**
     * The numeric identifier of the project.
     * 
    */
    public String number() {
        return this.number;
    }
    public String orgId() {
        return this.orgId;
    }
    public Optional<String> projectId() {
        return Optional.ofNullable(this.projectId);
    }
    public Boolean skipDelete() {
        return this.skipDelete;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetProjectResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean autoCreateNetwork;
        private String billingAccount;
        private String folderId;
        private String id;
        private Map<String,String> labels;
        private String name;
        private String number;
        private String orgId;
        private @Nullable String projectId;
        private Boolean skipDelete;

        public Builder() {
    	      // Empty
        }

        public Builder(GetProjectResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoCreateNetwork = defaults.autoCreateNetwork;
    	      this.billingAccount = defaults.billingAccount;
    	      this.folderId = defaults.folderId;
    	      this.id = defaults.id;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.number = defaults.number;
    	      this.orgId = defaults.orgId;
    	      this.projectId = defaults.projectId;
    	      this.skipDelete = defaults.skipDelete;
        }

        public Builder autoCreateNetwork(Boolean autoCreateNetwork) {
            this.autoCreateNetwork = Objects.requireNonNull(autoCreateNetwork);
            return this;
        }
        public Builder billingAccount(String billingAccount) {
            this.billingAccount = Objects.requireNonNull(billingAccount);
            return this;
        }
        public Builder folderId(String folderId) {
            this.folderId = Objects.requireNonNull(folderId);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder number(String number) {
            this.number = Objects.requireNonNull(number);
            return this;
        }
        public Builder orgId(String orgId) {
            this.orgId = Objects.requireNonNull(orgId);
            return this;
        }
        public Builder projectId(@Nullable String projectId) {
            this.projectId = projectId;
            return this;
        }
        public Builder skipDelete(Boolean skipDelete) {
            this.skipDelete = Objects.requireNonNull(skipDelete);
            return this;
        }        public GetProjectResult build() {
            return new GetProjectResult(autoCreateNetwork, billingAccount, folderId, id, labels, name, number, orgId, projectId, skipDelete);
        }
    }
}
