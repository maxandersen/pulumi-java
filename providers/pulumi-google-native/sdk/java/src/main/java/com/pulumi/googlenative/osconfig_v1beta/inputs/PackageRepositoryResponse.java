// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.osconfig_v1beta.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.osconfig_v1beta.inputs.AptRepositoryResponse;
import com.pulumi.googlenative.osconfig_v1beta.inputs.GooRepositoryResponse;
import com.pulumi.googlenative.osconfig_v1beta.inputs.YumRepositoryResponse;
import com.pulumi.googlenative.osconfig_v1beta.inputs.ZypperRepositoryResponse;
import java.util.Objects;


/**
 * A package repository.
 * 
 */
public final class PackageRepositoryResponse extends com.pulumi.resources.InvokeArgs {

    public static final PackageRepositoryResponse Empty = new PackageRepositoryResponse();

    /**
     * An Apt Repository.
     * 
     */
    @Import(name="apt", required=true)
      private final AptRepositoryResponse apt;

    public AptRepositoryResponse apt() {
        return this.apt;
    }

    /**
     * A Goo Repository.
     * 
     */
    @Import(name="goo", required=true)
      private final GooRepositoryResponse goo;

    public GooRepositoryResponse goo() {
        return this.goo;
    }

    /**
     * A Yum Repository.
     * 
     */
    @Import(name="yum", required=true)
      private final YumRepositoryResponse yum;

    public YumRepositoryResponse yum() {
        return this.yum;
    }

    /**
     * A Zypper Repository.
     * 
     */
    @Import(name="zypper", required=true)
      private final ZypperRepositoryResponse zypper;

    public ZypperRepositoryResponse zypper() {
        return this.zypper;
    }

    public PackageRepositoryResponse(
        AptRepositoryResponse apt,
        GooRepositoryResponse goo,
        YumRepositoryResponse yum,
        ZypperRepositoryResponse zypper) {
        this.apt = Objects.requireNonNull(apt, "expected parameter 'apt' to be non-null");
        this.goo = Objects.requireNonNull(goo, "expected parameter 'goo' to be non-null");
        this.yum = Objects.requireNonNull(yum, "expected parameter 'yum' to be non-null");
        this.zypper = Objects.requireNonNull(zypper, "expected parameter 'zypper' to be non-null");
    }

    private PackageRepositoryResponse() {
        this.apt = null;
        this.goo = null;
        this.yum = null;
        this.zypper = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PackageRepositoryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AptRepositoryResponse apt;
        private GooRepositoryResponse goo;
        private YumRepositoryResponse yum;
        private ZypperRepositoryResponse zypper;

        public Builder() {
    	      // Empty
        }

        public Builder(PackageRepositoryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apt = defaults.apt;
    	      this.goo = defaults.goo;
    	      this.yum = defaults.yum;
    	      this.zypper = defaults.zypper;
        }

        public Builder apt(AptRepositoryResponse apt) {
            this.apt = Objects.requireNonNull(apt);
            return this;
        }
        public Builder goo(GooRepositoryResponse goo) {
            this.goo = Objects.requireNonNull(goo);
            return this;
        }
        public Builder yum(YumRepositoryResponse yum) {
            this.yum = Objects.requireNonNull(yum);
            return this;
        }
        public Builder zypper(ZypperRepositoryResponse zypper) {
            this.zypper = Objects.requireNonNull(zypper);
            return this;
        }        public PackageRepositoryResponse build() {
            return new PackageRepositoryResponse(apt, goo, yum, zypper);
        }
    }
}
