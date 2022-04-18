// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.wafv2;

import com.pulumi.awsnative.wafv2.enums.IPSetIPAddressVersion;
import com.pulumi.awsnative.wafv2.enums.IPSetScope;
import com.pulumi.awsnative.wafv2.inputs.IPSetTagArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IPSetArgs extends com.pulumi.resources.ResourceArgs {

    public static final IPSetArgs Empty = new IPSetArgs();

    /**
     * List of IPAddresses.
     * 
     */
    @Import(name="addresses", required=true)
      private final Output<List<String>> addresses;

    public Output<List<String>> addresses() {
        return this.addresses;
    }

    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> description() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    @Import(name="iPAddressVersion", required=true)
      private final Output<IPSetIPAddressVersion> iPAddressVersion;

    public Output<IPSetIPAddressVersion> iPAddressVersion() {
        return this.iPAddressVersion;
    }

    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    @Import(name="scope", required=true)
      private final Output<IPSetScope> scope;

    public Output<IPSetScope> scope() {
        return this.scope;
    }

    @Import(name="tags")
      private final @Nullable Output<List<IPSetTagArgs>> tags;

    public Output<List<IPSetTagArgs>> tags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public IPSetArgs(
        Output<List<String>> addresses,
        @Nullable Output<String> description,
        Output<IPSetIPAddressVersion> iPAddressVersion,
        @Nullable Output<String> name,
        Output<IPSetScope> scope,
        @Nullable Output<List<IPSetTagArgs>> tags) {
        this.addresses = Objects.requireNonNull(addresses, "expected parameter 'addresses' to be non-null");
        this.description = description;
        this.iPAddressVersion = Objects.requireNonNull(iPAddressVersion, "expected parameter 'iPAddressVersion' to be non-null");
        this.name = name;
        this.scope = Objects.requireNonNull(scope, "expected parameter 'scope' to be non-null");
        this.tags = tags;
    }

    private IPSetArgs() {
        this.addresses = Codegen.empty();
        this.description = Codegen.empty();
        this.iPAddressVersion = Codegen.empty();
        this.name = Codegen.empty();
        this.scope = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IPSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<String>> addresses;
        private @Nullable Output<String> description;
        private Output<IPSetIPAddressVersion> iPAddressVersion;
        private @Nullable Output<String> name;
        private Output<IPSetScope> scope;
        private @Nullable Output<List<IPSetTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(IPSetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addresses = defaults.addresses;
    	      this.description = defaults.description;
    	      this.iPAddressVersion = defaults.iPAddressVersion;
    	      this.name = defaults.name;
    	      this.scope = defaults.scope;
    	      this.tags = defaults.tags;
        }

        public Builder addresses(Output<List<String>> addresses) {
            this.addresses = Objects.requireNonNull(addresses);
            return this;
        }
        public Builder addresses(List<String> addresses) {
            this.addresses = Output.of(Objects.requireNonNull(addresses));
            return this;
        }
        public Builder addresses(String... addresses) {
            return addresses(List.of(addresses));
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder iPAddressVersion(Output<IPSetIPAddressVersion> iPAddressVersion) {
            this.iPAddressVersion = Objects.requireNonNull(iPAddressVersion);
            return this;
        }
        public Builder iPAddressVersion(IPSetIPAddressVersion iPAddressVersion) {
            this.iPAddressVersion = Output.of(Objects.requireNonNull(iPAddressVersion));
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
        public Builder scope(Output<IPSetScope> scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }
        public Builder scope(IPSetScope scope) {
            this.scope = Output.of(Objects.requireNonNull(scope));
            return this;
        }
        public Builder tags(@Nullable Output<List<IPSetTagArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<IPSetTagArgs> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tags(IPSetTagArgs... tags) {
            return tags(List.of(tags));
        }        public IPSetArgs build() {
            return new IPSetArgs(addresses, description, iPAddressVersion, name, scope, tags);
        }
    }
}
