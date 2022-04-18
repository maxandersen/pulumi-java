// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lightsail.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DomainState extends com.pulumi.resources.ResourceArgs {

    public static final DomainState Empty = new DomainState();

    /**
     * The ARN of the Lightsail domain
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> arn() {
        return this.arn == null ? Codegen.empty() : this.arn;
    }

    /**
     * The name of the Lightsail domain to manage
     * 
     */
    @Import(name="domainName")
      private final @Nullable Output<String> domainName;

    public Output<String> domainName() {
        return this.domainName == null ? Codegen.empty() : this.domainName;
    }

    public DomainState(
        @Nullable Output<String> arn,
        @Nullable Output<String> domainName) {
        this.arn = arn;
        this.domainName = domainName;
    }

    private DomainState() {
        this.arn = Codegen.empty();
        this.domainName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> domainName;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.domainName = defaults.domainName;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Codegen.ofNullable(arn);
            return this;
        }
        public Builder domainName(@Nullable Output<String> domainName) {
            this.domainName = domainName;
            return this;
        }
        public Builder domainName(@Nullable String domainName) {
            this.domainName = Codegen.ofNullable(domainName);
            return this;
        }        public DomainState build() {
            return new DomainState(arn, domainName);
        }
    }
}
