// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_alpha;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.compute_alpha.enums.InterconnectInterconnectType;
import com.pulumi.googlenative.compute_alpha.enums.InterconnectLinkType;
import com.pulumi.googlenative.compute_alpha.inputs.InterconnectMacsecArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InterconnectArgs extends com.pulumi.resources.ResourceArgs {

    public static final InterconnectArgs Empty = new InterconnectArgs();

    /**
     * Administrative status of the interconnect. When this is set to true, the Interconnect is functional and can carry traffic. When set to false, no packets can be carried over the interconnect and no BGP routes are exchanged over it. By default, the status is set to true.
     * 
     */
    @Import(name="adminEnabled")
      private final @Nullable Output<Boolean> adminEnabled;

    public Output<Boolean> adminEnabled() {
        return this.adminEnabled == null ? Codegen.empty() : this.adminEnabled;
    }

    /**
     * Customer name, to put in the Letter of Authorization as the party authorized to request a crossconnect.
     * 
     */
    @Import(name="customerName")
      private final @Nullable Output<String> customerName;

    public Output<String> customerName() {
        return this.customerName == null ? Codegen.empty() : this.customerName;
    }

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Type of interconnect, which can take one of the following values: - PARTNER: A partner-managed interconnection shared between customers though a partner. - DEDICATED: A dedicated physical interconnection with the customer. Note that a value IT_PRIVATE has been deprecated in favor of DEDICATED.
     * 
     */
    @Import(name="interconnectType")
      private final @Nullable Output<InterconnectInterconnectType> interconnectType;

    public Output<InterconnectInterconnectType> interconnectType() {
        return this.interconnectType == null ? Codegen.empty() : this.interconnectType;
    }

    /**
     * Labels for this resource. These can only be added or modified by the setLabels method. Each label key/value pair must comply with RFC1035. Label values may be empty.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> labels() {
        return this.labels == null ? Codegen.empty() : this.labels;
    }

    /**
     * Type of link requested, which can take one of the following values: - LINK_TYPE_ETHERNET_10G_LR: A 10G Ethernet with LR optics - LINK_TYPE_ETHERNET_100G_LR: A 100G Ethernet with LR optics. Note that this field indicates the speed of each of the links in the bundle, not the speed of the entire bundle.
     * 
     */
    @Import(name="linkType")
      private final @Nullable Output<InterconnectLinkType> linkType;

    public Output<InterconnectLinkType> linkType() {
        return this.linkType == null ? Codegen.empty() : this.linkType;
    }

    /**
     * URL of the InterconnectLocation object that represents where this connection is to be provisioned.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> location() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * Configuration to enable Media Access Control security (MACsec) on the Interconnect between Google and your on-premises router.
     * 
     */
    @Import(name="macsec")
      private final @Nullable Output<InterconnectMacsecArgs> macsec;

    public Output<InterconnectMacsecArgs> macsec() {
        return this.macsec == null ? Codegen.empty() : this.macsec;
    }

    /**
     * Enable or disable MACsec on this Interconnect. MACsec enablement will fail if the macsec object is not specified.
     * 
     */
    @Import(name="macsecEnabled")
      private final @Nullable Output<Boolean> macsecEnabled;

    public Output<Boolean> macsecEnabled() {
        return this.macsecEnabled == null ? Codegen.empty() : this.macsecEnabled;
    }

    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Email address to contact the customer NOC for operations and maintenance notifications regarding this Interconnect. If specified, this will be used for notifications in addition to all other forms described, such as Stackdriver logs alerting and Cloud Notifications.
     * 
     */
    @Import(name="nocContactEmail")
      private final @Nullable Output<String> nocContactEmail;

    public Output<String> nocContactEmail() {
        return this.nocContactEmail == null ? Codegen.empty() : this.nocContactEmail;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    @Import(name="requestId")
      private final @Nullable Output<String> requestId;

    public Output<String> requestId() {
        return this.requestId == null ? Codegen.empty() : this.requestId;
    }

    /**
     * Target number of physical links in the link bundle, as requested by the customer.
     * 
     */
    @Import(name="requestedLinkCount")
      private final @Nullable Output<Integer> requestedLinkCount;

    public Output<Integer> requestedLinkCount() {
        return this.requestedLinkCount == null ? Codegen.empty() : this.requestedLinkCount;
    }

    public InterconnectArgs(
        @Nullable Output<Boolean> adminEnabled,
        @Nullable Output<String> customerName,
        @Nullable Output<String> description,
        @Nullable Output<InterconnectInterconnectType> interconnectType,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<InterconnectLinkType> linkType,
        @Nullable Output<String> location,
        @Nullable Output<InterconnectMacsecArgs> macsec,
        @Nullable Output<Boolean> macsecEnabled,
        @Nullable Output<String> name,
        @Nullable Output<String> nocContactEmail,
        @Nullable Output<String> project,
        @Nullable Output<String> requestId,
        @Nullable Output<Integer> requestedLinkCount) {
        this.adminEnabled = adminEnabled;
        this.customerName = customerName;
        this.description = description;
        this.interconnectType = interconnectType;
        this.labels = labels;
        this.linkType = linkType;
        this.location = location;
        this.macsec = macsec;
        this.macsecEnabled = macsecEnabled;
        this.name = name;
        this.nocContactEmail = nocContactEmail;
        this.project = project;
        this.requestId = requestId;
        this.requestedLinkCount = requestedLinkCount;
    }

    private InterconnectArgs() {
        this.adminEnabled = Codegen.empty();
        this.customerName = Codegen.empty();
        this.description = Codegen.empty();
        this.interconnectType = Codegen.empty();
        this.labels = Codegen.empty();
        this.linkType = Codegen.empty();
        this.location = Codegen.empty();
        this.macsec = Codegen.empty();
        this.macsecEnabled = Codegen.empty();
        this.name = Codegen.empty();
        this.nocContactEmail = Codegen.empty();
        this.project = Codegen.empty();
        this.requestId = Codegen.empty();
        this.requestedLinkCount = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InterconnectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> adminEnabled;
        private @Nullable Output<String> customerName;
        private @Nullable Output<String> description;
        private @Nullable Output<InterconnectInterconnectType> interconnectType;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<InterconnectLinkType> linkType;
        private @Nullable Output<String> location;
        private @Nullable Output<InterconnectMacsecArgs> macsec;
        private @Nullable Output<Boolean> macsecEnabled;
        private @Nullable Output<String> name;
        private @Nullable Output<String> nocContactEmail;
        private @Nullable Output<String> project;
        private @Nullable Output<String> requestId;
        private @Nullable Output<Integer> requestedLinkCount;

        public Builder() {
    	      // Empty
        }

        public Builder(InterconnectArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.adminEnabled = defaults.adminEnabled;
    	      this.customerName = defaults.customerName;
    	      this.description = defaults.description;
    	      this.interconnectType = defaults.interconnectType;
    	      this.labels = defaults.labels;
    	      this.linkType = defaults.linkType;
    	      this.location = defaults.location;
    	      this.macsec = defaults.macsec;
    	      this.macsecEnabled = defaults.macsecEnabled;
    	      this.name = defaults.name;
    	      this.nocContactEmail = defaults.nocContactEmail;
    	      this.project = defaults.project;
    	      this.requestId = defaults.requestId;
    	      this.requestedLinkCount = defaults.requestedLinkCount;
        }

        public Builder adminEnabled(@Nullable Output<Boolean> adminEnabled) {
            this.adminEnabled = adminEnabled;
            return this;
        }
        public Builder adminEnabled(@Nullable Boolean adminEnabled) {
            this.adminEnabled = Codegen.ofNullable(adminEnabled);
            return this;
        }
        public Builder customerName(@Nullable Output<String> customerName) {
            this.customerName = customerName;
            return this;
        }
        public Builder customerName(@Nullable String customerName) {
            this.customerName = Codegen.ofNullable(customerName);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder interconnectType(@Nullable Output<InterconnectInterconnectType> interconnectType) {
            this.interconnectType = interconnectType;
            return this;
        }
        public Builder interconnectType(@Nullable InterconnectInterconnectType interconnectType) {
            this.interconnectType = Codegen.ofNullable(interconnectType);
            return this;
        }
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Codegen.ofNullable(labels);
            return this;
        }
        public Builder linkType(@Nullable Output<InterconnectLinkType> linkType) {
            this.linkType = linkType;
            return this;
        }
        public Builder linkType(@Nullable InterconnectLinkType linkType) {
            this.linkType = Codegen.ofNullable(linkType);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder macsec(@Nullable Output<InterconnectMacsecArgs> macsec) {
            this.macsec = macsec;
            return this;
        }
        public Builder macsec(@Nullable InterconnectMacsecArgs macsec) {
            this.macsec = Codegen.ofNullable(macsec);
            return this;
        }
        public Builder macsecEnabled(@Nullable Output<Boolean> macsecEnabled) {
            this.macsecEnabled = macsecEnabled;
            return this;
        }
        public Builder macsecEnabled(@Nullable Boolean macsecEnabled) {
            this.macsecEnabled = Codegen.ofNullable(macsecEnabled);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder nocContactEmail(@Nullable Output<String> nocContactEmail) {
            this.nocContactEmail = nocContactEmail;
            return this;
        }
        public Builder nocContactEmail(@Nullable String nocContactEmail) {
            this.nocContactEmail = Codegen.ofNullable(nocContactEmail);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder requestId(@Nullable Output<String> requestId) {
            this.requestId = requestId;
            return this;
        }
        public Builder requestId(@Nullable String requestId) {
            this.requestId = Codegen.ofNullable(requestId);
            return this;
        }
        public Builder requestedLinkCount(@Nullable Output<Integer> requestedLinkCount) {
            this.requestedLinkCount = requestedLinkCount;
            return this;
        }
        public Builder requestedLinkCount(@Nullable Integer requestedLinkCount) {
            this.requestedLinkCount = Codegen.ofNullable(requestedLinkCount);
            return this;
        }        public InterconnectArgs build() {
            return new InterconnectArgs(adminEnabled, customerName, description, interconnectType, labels, linkType, location, macsec, macsecEnabled, name, nocContactEmail, project, requestId, requestedLinkCount);
        }
    }
}
