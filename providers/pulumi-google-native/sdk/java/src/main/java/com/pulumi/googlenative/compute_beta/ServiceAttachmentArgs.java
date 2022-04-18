// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import com.pulumi.googlenative.compute_beta.enums.ServiceAttachmentConnectionPreference;
import com.pulumi.googlenative.compute_beta.inputs.ServiceAttachmentConsumerProjectLimitArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceAttachmentArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceAttachmentArgs Empty = new ServiceAttachmentArgs();

    /**
     * The connection preference of service attachment. The value can be set to ACCEPT_AUTOMATIC. An ACCEPT_AUTOMATIC service attachment is one that always accepts the connection from consumer forwarding rules.
     * 
     */
    @Import(name="connectionPreference")
      private final @Nullable Output<ServiceAttachmentConnectionPreference> connectionPreference;

    public Output<ServiceAttachmentConnectionPreference> connectionPreference() {
        return this.connectionPreference == null ? Codegen.empty() : this.connectionPreference;
    }

    /**
     * Projects that are allowed to connect to this service attachment.
     * 
     */
    @Import(name="consumerAcceptLists")
      private final @Nullable Output<List<ServiceAttachmentConsumerProjectLimitArgs>> consumerAcceptLists;

    public Output<List<ServiceAttachmentConsumerProjectLimitArgs>> consumerAcceptLists() {
        return this.consumerAcceptLists == null ? Codegen.empty() : this.consumerAcceptLists;
    }

    /**
     * Projects that are not allowed to connect to this service attachment. The project can be specified using its id or number.
     * 
     */
    @Import(name="consumerRejectLists")
      private final @Nullable Output<List<String>> consumerRejectLists;

    public Output<List<String>> consumerRejectLists() {
        return this.consumerRejectLists == null ? Codegen.empty() : this.consumerRejectLists;
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
     * If specified, the domain name will be used during the integration between the PSC connected endpoints and the Cloud DNS. For example, this is a valid domain name: "p.mycompany.com.". Current max number of domain names supported is 1.
     * 
     */
    @Import(name="domainNames")
      private final @Nullable Output<List<String>> domainNames;

    public Output<List<String>> domainNames() {
        return this.domainNames == null ? Codegen.empty() : this.domainNames;
    }

    /**
     * If true, enable the proxy protocol which is for supplying client TCP/IP address data in TCP connections that traverse proxies on their way to destination servers.
     * 
     */
    @Import(name="enableProxyProtocol")
      private final @Nullable Output<Boolean> enableProxyProtocol;

    public Output<Boolean> enableProxyProtocol() {
        return this.enableProxyProtocol == null ? Codegen.empty() : this.enableProxyProtocol;
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
     * An array of URLs where each entry is the URL of a subnet provided by the service producer to use for NAT in this service attachment.
     * 
     */
    @Import(name="natSubnets")
      private final @Nullable Output<List<String>> natSubnets;

    public Output<List<String>> natSubnets() {
        return this.natSubnets == null ? Codegen.empty() : this.natSubnets;
    }

    /**
     * The URL of a forwarding rule with loadBalancingScheme INTERNAL* that is serving the endpoint identified by this service attachment.
     * 
     */
    @Import(name="producerForwardingRule")
      private final @Nullable Output<String> producerForwardingRule;

    public Output<String> producerForwardingRule() {
        return this.producerForwardingRule == null ? Codegen.empty() : this.producerForwardingRule;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> project() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    @Import(name="region", required=true)
      private final Output<String> region;

    public Output<String> region() {
        return this.region;
    }

    @Import(name="requestId")
      private final @Nullable Output<String> requestId;

    public Output<String> requestId() {
        return this.requestId == null ? Codegen.empty() : this.requestId;
    }

    /**
     * The URL of a service serving the endpoint identified by this service attachment.
     * 
     */
    @Import(name="targetService")
      private final @Nullable Output<String> targetService;

    public Output<String> targetService() {
        return this.targetService == null ? Codegen.empty() : this.targetService;
    }

    public ServiceAttachmentArgs(
        @Nullable Output<ServiceAttachmentConnectionPreference> connectionPreference,
        @Nullable Output<List<ServiceAttachmentConsumerProjectLimitArgs>> consumerAcceptLists,
        @Nullable Output<List<String>> consumerRejectLists,
        @Nullable Output<String> description,
        @Nullable Output<List<String>> domainNames,
        @Nullable Output<Boolean> enableProxyProtocol,
        @Nullable Output<String> name,
        @Nullable Output<List<String>> natSubnets,
        @Nullable Output<String> producerForwardingRule,
        @Nullable Output<String> project,
        Output<String> region,
        @Nullable Output<String> requestId,
        @Nullable Output<String> targetService) {
        this.connectionPreference = connectionPreference;
        this.consumerAcceptLists = consumerAcceptLists;
        this.consumerRejectLists = consumerRejectLists;
        this.description = description;
        this.domainNames = domainNames;
        this.enableProxyProtocol = enableProxyProtocol;
        this.name = name;
        this.natSubnets = natSubnets;
        this.producerForwardingRule = producerForwardingRule;
        this.project = project;
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
        this.requestId = requestId;
        this.targetService = targetService;
    }

    private ServiceAttachmentArgs() {
        this.connectionPreference = Codegen.empty();
        this.consumerAcceptLists = Codegen.empty();
        this.consumerRejectLists = Codegen.empty();
        this.description = Codegen.empty();
        this.domainNames = Codegen.empty();
        this.enableProxyProtocol = Codegen.empty();
        this.name = Codegen.empty();
        this.natSubnets = Codegen.empty();
        this.producerForwardingRule = Codegen.empty();
        this.project = Codegen.empty();
        this.region = Codegen.empty();
        this.requestId = Codegen.empty();
        this.targetService = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceAttachmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ServiceAttachmentConnectionPreference> connectionPreference;
        private @Nullable Output<List<ServiceAttachmentConsumerProjectLimitArgs>> consumerAcceptLists;
        private @Nullable Output<List<String>> consumerRejectLists;
        private @Nullable Output<String> description;
        private @Nullable Output<List<String>> domainNames;
        private @Nullable Output<Boolean> enableProxyProtocol;
        private @Nullable Output<String> name;
        private @Nullable Output<List<String>> natSubnets;
        private @Nullable Output<String> producerForwardingRule;
        private @Nullable Output<String> project;
        private Output<String> region;
        private @Nullable Output<String> requestId;
        private @Nullable Output<String> targetService;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceAttachmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionPreference = defaults.connectionPreference;
    	      this.consumerAcceptLists = defaults.consumerAcceptLists;
    	      this.consumerRejectLists = defaults.consumerRejectLists;
    	      this.description = defaults.description;
    	      this.domainNames = defaults.domainNames;
    	      this.enableProxyProtocol = defaults.enableProxyProtocol;
    	      this.name = defaults.name;
    	      this.natSubnets = defaults.natSubnets;
    	      this.producerForwardingRule = defaults.producerForwardingRule;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.requestId = defaults.requestId;
    	      this.targetService = defaults.targetService;
        }

        public Builder connectionPreference(@Nullable Output<ServiceAttachmentConnectionPreference> connectionPreference) {
            this.connectionPreference = connectionPreference;
            return this;
        }
        public Builder connectionPreference(@Nullable ServiceAttachmentConnectionPreference connectionPreference) {
            this.connectionPreference = Codegen.ofNullable(connectionPreference);
            return this;
        }
        public Builder consumerAcceptLists(@Nullable Output<List<ServiceAttachmentConsumerProjectLimitArgs>> consumerAcceptLists) {
            this.consumerAcceptLists = consumerAcceptLists;
            return this;
        }
        public Builder consumerAcceptLists(@Nullable List<ServiceAttachmentConsumerProjectLimitArgs> consumerAcceptLists) {
            this.consumerAcceptLists = Codegen.ofNullable(consumerAcceptLists);
            return this;
        }
        public Builder consumerAcceptLists(ServiceAttachmentConsumerProjectLimitArgs... consumerAcceptLists) {
            return consumerAcceptLists(List.of(consumerAcceptLists));
        }
        public Builder consumerRejectLists(@Nullable Output<List<String>> consumerRejectLists) {
            this.consumerRejectLists = consumerRejectLists;
            return this;
        }
        public Builder consumerRejectLists(@Nullable List<String> consumerRejectLists) {
            this.consumerRejectLists = Codegen.ofNullable(consumerRejectLists);
            return this;
        }
        public Builder consumerRejectLists(String... consumerRejectLists) {
            return consumerRejectLists(List.of(consumerRejectLists));
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder domainNames(@Nullable Output<List<String>> domainNames) {
            this.domainNames = domainNames;
            return this;
        }
        public Builder domainNames(@Nullable List<String> domainNames) {
            this.domainNames = Codegen.ofNullable(domainNames);
            return this;
        }
        public Builder domainNames(String... domainNames) {
            return domainNames(List.of(domainNames));
        }
        public Builder enableProxyProtocol(@Nullable Output<Boolean> enableProxyProtocol) {
            this.enableProxyProtocol = enableProxyProtocol;
            return this;
        }
        public Builder enableProxyProtocol(@Nullable Boolean enableProxyProtocol) {
            this.enableProxyProtocol = Codegen.ofNullable(enableProxyProtocol);
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
        public Builder natSubnets(@Nullable Output<List<String>> natSubnets) {
            this.natSubnets = natSubnets;
            return this;
        }
        public Builder natSubnets(@Nullable List<String> natSubnets) {
            this.natSubnets = Codegen.ofNullable(natSubnets);
            return this;
        }
        public Builder natSubnets(String... natSubnets) {
            return natSubnets(List.of(natSubnets));
        }
        public Builder producerForwardingRule(@Nullable Output<String> producerForwardingRule) {
            this.producerForwardingRule = producerForwardingRule;
            return this;
        }
        public Builder producerForwardingRule(@Nullable String producerForwardingRule) {
            this.producerForwardingRule = Codegen.ofNullable(producerForwardingRule);
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
        public Builder region(Output<String> region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        public Builder region(String region) {
            this.region = Output.of(Objects.requireNonNull(region));
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
        public Builder targetService(@Nullable Output<String> targetService) {
            this.targetService = targetService;
            return this;
        }
        public Builder targetService(@Nullable String targetService) {
            this.targetService = Codegen.ofNullable(targetService);
            return this;
        }        public ServiceAttachmentArgs build() {
            return new ServiceAttachmentArgs(connectionPreference, consumerAcceptLists, consumerRejectLists, description, domainNames, enableProxyProtocol, name, natSubnets, producerForwardingRule, project, region, requestId, targetService);
        }
    }
}
