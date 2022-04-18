// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.iotwireless.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DeviceProfileLoRaWANDeviceProfile extends com.pulumi.resources.InvokeArgs {

    public static final DeviceProfileLoRaWANDeviceProfile Empty = new DeviceProfileLoRaWANDeviceProfile();

    @Import(name="classBTimeout")
      private final @Nullable Integer classBTimeout;

    public Optional<Integer> classBTimeout() {
        return this.classBTimeout == null ? Optional.empty() : Optional.ofNullable(this.classBTimeout);
    }

    @Import(name="classCTimeout")
      private final @Nullable Integer classCTimeout;

    public Optional<Integer> classCTimeout() {
        return this.classCTimeout == null ? Optional.empty() : Optional.ofNullable(this.classCTimeout);
    }

    @Import(name="macVersion")
      private final @Nullable String macVersion;

    public Optional<String> macVersion() {
        return this.macVersion == null ? Optional.empty() : Optional.ofNullable(this.macVersion);
    }

    @Import(name="maxDutyCycle")
      private final @Nullable Integer maxDutyCycle;

    public Optional<Integer> maxDutyCycle() {
        return this.maxDutyCycle == null ? Optional.empty() : Optional.ofNullable(this.maxDutyCycle);
    }

    @Import(name="maxEirp")
      private final @Nullable Integer maxEirp;

    public Optional<Integer> maxEirp() {
        return this.maxEirp == null ? Optional.empty() : Optional.ofNullable(this.maxEirp);
    }

    @Import(name="pingSlotDr")
      private final @Nullable Integer pingSlotDr;

    public Optional<Integer> pingSlotDr() {
        return this.pingSlotDr == null ? Optional.empty() : Optional.ofNullable(this.pingSlotDr);
    }

    @Import(name="pingSlotFreq")
      private final @Nullable Integer pingSlotFreq;

    public Optional<Integer> pingSlotFreq() {
        return this.pingSlotFreq == null ? Optional.empty() : Optional.ofNullable(this.pingSlotFreq);
    }

    @Import(name="pingSlotPeriod")
      private final @Nullable Integer pingSlotPeriod;

    public Optional<Integer> pingSlotPeriod() {
        return this.pingSlotPeriod == null ? Optional.empty() : Optional.ofNullable(this.pingSlotPeriod);
    }

    @Import(name="regParamsRevision")
      private final @Nullable String regParamsRevision;

    public Optional<String> regParamsRevision() {
        return this.regParamsRevision == null ? Optional.empty() : Optional.ofNullable(this.regParamsRevision);
    }

    @Import(name="rfRegion")
      private final @Nullable String rfRegion;

    public Optional<String> rfRegion() {
        return this.rfRegion == null ? Optional.empty() : Optional.ofNullable(this.rfRegion);
    }

    @Import(name="supports32BitFCnt")
      private final @Nullable Boolean supports32BitFCnt;

    public Optional<Boolean> supports32BitFCnt() {
        return this.supports32BitFCnt == null ? Optional.empty() : Optional.ofNullable(this.supports32BitFCnt);
    }

    @Import(name="supportsClassB")
      private final @Nullable Boolean supportsClassB;

    public Optional<Boolean> supportsClassB() {
        return this.supportsClassB == null ? Optional.empty() : Optional.ofNullable(this.supportsClassB);
    }

    @Import(name="supportsClassC")
      private final @Nullable Boolean supportsClassC;

    public Optional<Boolean> supportsClassC() {
        return this.supportsClassC == null ? Optional.empty() : Optional.ofNullable(this.supportsClassC);
    }

    @Import(name="supportsJoin")
      private final @Nullable Boolean supportsJoin;

    public Optional<Boolean> supportsJoin() {
        return this.supportsJoin == null ? Optional.empty() : Optional.ofNullable(this.supportsJoin);
    }

    public DeviceProfileLoRaWANDeviceProfile(
        @Nullable Integer classBTimeout,
        @Nullable Integer classCTimeout,
        @Nullable String macVersion,
        @Nullable Integer maxDutyCycle,
        @Nullable Integer maxEirp,
        @Nullable Integer pingSlotDr,
        @Nullable Integer pingSlotFreq,
        @Nullable Integer pingSlotPeriod,
        @Nullable String regParamsRevision,
        @Nullable String rfRegion,
        @Nullable Boolean supports32BitFCnt,
        @Nullable Boolean supportsClassB,
        @Nullable Boolean supportsClassC,
        @Nullable Boolean supportsJoin) {
        this.classBTimeout = classBTimeout;
        this.classCTimeout = classCTimeout;
        this.macVersion = macVersion;
        this.maxDutyCycle = maxDutyCycle;
        this.maxEirp = maxEirp;
        this.pingSlotDr = pingSlotDr;
        this.pingSlotFreq = pingSlotFreq;
        this.pingSlotPeriod = pingSlotPeriod;
        this.regParamsRevision = regParamsRevision;
        this.rfRegion = rfRegion;
        this.supports32BitFCnt = supports32BitFCnt;
        this.supportsClassB = supportsClassB;
        this.supportsClassC = supportsClassC;
        this.supportsJoin = supportsJoin;
    }

    private DeviceProfileLoRaWANDeviceProfile() {
        this.classBTimeout = null;
        this.classCTimeout = null;
        this.macVersion = null;
        this.maxDutyCycle = null;
        this.maxEirp = null;
        this.pingSlotDr = null;
        this.pingSlotFreq = null;
        this.pingSlotPeriod = null;
        this.regParamsRevision = null;
        this.rfRegion = null;
        this.supports32BitFCnt = null;
        this.supportsClassB = null;
        this.supportsClassC = null;
        this.supportsJoin = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeviceProfileLoRaWANDeviceProfile defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer classBTimeout;
        private @Nullable Integer classCTimeout;
        private @Nullable String macVersion;
        private @Nullable Integer maxDutyCycle;
        private @Nullable Integer maxEirp;
        private @Nullable Integer pingSlotDr;
        private @Nullable Integer pingSlotFreq;
        private @Nullable Integer pingSlotPeriod;
        private @Nullable String regParamsRevision;
        private @Nullable String rfRegion;
        private @Nullable Boolean supports32BitFCnt;
        private @Nullable Boolean supportsClassB;
        private @Nullable Boolean supportsClassC;
        private @Nullable Boolean supportsJoin;

        public Builder() {
    	      // Empty
        }

        public Builder(DeviceProfileLoRaWANDeviceProfile defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.classBTimeout = defaults.classBTimeout;
    	      this.classCTimeout = defaults.classCTimeout;
    	      this.macVersion = defaults.macVersion;
    	      this.maxDutyCycle = defaults.maxDutyCycle;
    	      this.maxEirp = defaults.maxEirp;
    	      this.pingSlotDr = defaults.pingSlotDr;
    	      this.pingSlotFreq = defaults.pingSlotFreq;
    	      this.pingSlotPeriod = defaults.pingSlotPeriod;
    	      this.regParamsRevision = defaults.regParamsRevision;
    	      this.rfRegion = defaults.rfRegion;
    	      this.supports32BitFCnt = defaults.supports32BitFCnt;
    	      this.supportsClassB = defaults.supportsClassB;
    	      this.supportsClassC = defaults.supportsClassC;
    	      this.supportsJoin = defaults.supportsJoin;
        }

        public Builder classBTimeout(@Nullable Integer classBTimeout) {
            this.classBTimeout = classBTimeout;
            return this;
        }
        public Builder classCTimeout(@Nullable Integer classCTimeout) {
            this.classCTimeout = classCTimeout;
            return this;
        }
        public Builder macVersion(@Nullable String macVersion) {
            this.macVersion = macVersion;
            return this;
        }
        public Builder maxDutyCycle(@Nullable Integer maxDutyCycle) {
            this.maxDutyCycle = maxDutyCycle;
            return this;
        }
        public Builder maxEirp(@Nullable Integer maxEirp) {
            this.maxEirp = maxEirp;
            return this;
        }
        public Builder pingSlotDr(@Nullable Integer pingSlotDr) {
            this.pingSlotDr = pingSlotDr;
            return this;
        }
        public Builder pingSlotFreq(@Nullable Integer pingSlotFreq) {
            this.pingSlotFreq = pingSlotFreq;
            return this;
        }
        public Builder pingSlotPeriod(@Nullable Integer pingSlotPeriod) {
            this.pingSlotPeriod = pingSlotPeriod;
            return this;
        }
        public Builder regParamsRevision(@Nullable String regParamsRevision) {
            this.regParamsRevision = regParamsRevision;
            return this;
        }
        public Builder rfRegion(@Nullable String rfRegion) {
            this.rfRegion = rfRegion;
            return this;
        }
        public Builder supports32BitFCnt(@Nullable Boolean supports32BitFCnt) {
            this.supports32BitFCnt = supports32BitFCnt;
            return this;
        }
        public Builder supportsClassB(@Nullable Boolean supportsClassB) {
            this.supportsClassB = supportsClassB;
            return this;
        }
        public Builder supportsClassC(@Nullable Boolean supportsClassC) {
            this.supportsClassC = supportsClassC;
            return this;
        }
        public Builder supportsJoin(@Nullable Boolean supportsJoin) {
            this.supportsJoin = supportsJoin;
            return this;
        }        public DeviceProfileLoRaWANDeviceProfile build() {
            return new DeviceProfileLoRaWANDeviceProfile(classBTimeout, classCTimeout, macVersion, maxDutyCycle, maxEirp, pingSlotDr, pingSlotFreq, pingSlotPeriod, regParamsRevision, rfRegion, supports32BitFCnt, supportsClassB, supportsClassC, supportsJoin);
        }
    }
}
